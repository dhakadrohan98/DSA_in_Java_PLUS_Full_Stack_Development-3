package org.codeship;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
	private CountDownLatch latch;

	public SomeThread(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Thread running with thread name "+Thread.currentThread().getName());
		System.out.println("Thread execution completed");
		System.out.println("*************************");
		latch.countDown();
	}
	
}

public class App {

	public static void main(String[] args) {
	
		CountDownLatch latch = new CountDownLatch(4);
		SomeThread thread1 = new SomeThread(latch);
		SomeThread thread2 = new SomeThread(latch);
		SomeThread thread3 = new SomeThread(latch);
		SomeThread thread4 = new SomeThread(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("I am in main thread");

	}

}
