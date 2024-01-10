package org.multithreading;

class SharedResource{
	
	private static int sharedCounter=0;
	private static final Object lock = new Object();
	
	public static void incrementCounter() {
			synchronized (lock) {
				sharedCounter++;
				System.out.println(Thread.currentThread().getName() 
						+ " | count- " + sharedCounter);
			}
	}
}

class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<=7; i++) {
			SharedResource.incrementCounter();
		}
	}
}


public class ClassLevelLock {

	public static void main(String[] args) {
		MyThread myth1 = new MyThread();
		MyThread myth2 = new MyThread();
		
		myth1.start();
		myth2.start();
		

	}

}
