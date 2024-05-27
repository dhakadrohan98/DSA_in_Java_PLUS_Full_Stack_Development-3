package org.classObjectLevelLock;

class MyClasss implements Runnable {
	@Override
	public void run() {
		lockingNonStaticMethod();
	}
	
	public void lockingNonStaticMethod() {
		System.out.println(Thread.currentThread().getName() + " got the lock");
		
		synchronized (this) {
			System.out.println("Synchronized code executed by " + Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + " releases the lock");
			System.out.println("----------");
		}
	}
}


public class ObjectLevelLock {

	public static void main(String[] args) {
		MyClasss myClasss = new MyClasss();
		
		Thread th1 = new Thread(myClasss);
		Thread th2 = new Thread(myClasss);
		Thread th3 = new Thread(myClasss);
		
		th1.setName("Thread 1");
		th2.setName("Thread 2");
		th2.setName("Thread 3");
		
		th1.start();
		th2.start();
		th3.start();
	}
}
