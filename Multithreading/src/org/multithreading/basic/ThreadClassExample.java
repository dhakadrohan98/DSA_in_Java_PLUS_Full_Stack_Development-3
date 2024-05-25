package org.multithreading.basic;

public class ThreadClassExample extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main (String[] args) throws InterruptedException {
		ThreadClassExample th1 = new ThreadClassExample();
		ThreadClassExample th2 = new ThreadClassExample();
		th1.start();
		th2.start();
	}
}
