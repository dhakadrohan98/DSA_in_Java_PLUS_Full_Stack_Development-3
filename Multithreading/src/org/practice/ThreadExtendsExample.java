package org.practice;

class MyThread extends Thread {
	
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i + " : " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadExtendsExample {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("Thread1");
		MyThread th2 = new MyThread("Thread2");
		
		th1.start();
		th2.start();

	}

}
