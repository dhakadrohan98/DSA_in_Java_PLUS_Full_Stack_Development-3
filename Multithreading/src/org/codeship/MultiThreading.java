package org.codeship;


class MyThread extends Thread {
	
	public synchronized void m1() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " count: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		MyThread myth1 = new MyThread();
		MyThread myth2 = new MyThread();
		myth1.m1();
		myth2.m1();

	}

}
