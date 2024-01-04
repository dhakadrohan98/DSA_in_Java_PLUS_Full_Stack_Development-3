package com.codeship;

public class ChatGptasInterviewer {

	public static void main(String[] args) {
		int n=10;
		int count=1;
		private final Object lock = new Object();
		sychronised(lock) {
			try {
				if(n%3 != 0 && count <= n) {
					System.out.println("Thread- "+threadId+": "+count );
					count++;
					lock.notifyAll();
				}
				else {
					lock.wait();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}
}
