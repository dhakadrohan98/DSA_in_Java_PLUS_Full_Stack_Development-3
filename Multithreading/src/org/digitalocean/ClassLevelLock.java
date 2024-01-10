package org.digitalocean;

class SharedResource1 {
	private static int sharedCounter = 0;
	
	//class level lock
	private static final Object lock = new Object();
	
	public static void incrementCounter() {
		synchronized (lock) {
			//critical section - only one thread can execute this block at a time
			sharedCounter++;
			System.out.println("Counter: "+ sharedCounter+ "| Current Thread: "+Thread.currentThread().getName());
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			SharedResource1.incrementCounter();
		}
	}
}

public class ClassLevelLock{

	public static void main(String[] args) {
		//creating multiple threads that share the same instance of SharedResource
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		MyThread1 thread3 = new MyThread1();
		
		//starts the thread
		thread1.start();
		thread2.start();
		thread3.start();;
		

	}
}