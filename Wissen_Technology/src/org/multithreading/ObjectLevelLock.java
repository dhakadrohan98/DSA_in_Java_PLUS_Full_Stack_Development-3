package org.multithreading;

class SharedResource1{
	
	private int sharedCounter=0;
	private final Object lock = new Object();
	
	public void incrementCounter() {
			synchronized (lock) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				sharedCounter++;
				System.out.println(Thread.currentThread().getName() 
						+ " | count- " + sharedCounter);
			}
	}
}

class MyThread1 extends Thread {
	
	private SharedResource1 sharedResource1;
	
	MyThread1(SharedResource1 sharedResource1) {
		this.sharedResource1 = sharedResource1;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=6; i++) {
			this.sharedResource1.incrementCounter();
		}
	}
}

public class ObjectLevelLock {
	public static void main(String[] args) {
		
		SharedResource1 sharedResource1 = new SharedResource1();
		SharedResource1 sharedResource2 = new SharedResource1();
		SharedResource1 sharedResource3 = new SharedResource1();
		
		
		MyThread1 myth1 = new MyThread1(sharedResource1);
		MyThread1 myth2 = new MyThread1(sharedResource2);
		MyThread1 myth3 = new MyThread1(sharedResource3);
		
		myth1.start();
		myth2.start();
		myth3.start();
	}
}
