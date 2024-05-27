package org.classObjectLevelLock;


class MyClass implements Runnable {
	@Override
	public void run() {
		lockingStaticMethod();
	}
	
	public static synchronized void lockingStaticMethod() {
		System.out.println(Thread.currentThread().getName() + " got the lock");
		
		synchronized (MyClass.class) {
			System.out.println("Synchronized code executed by " + Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + " releases the lock");
			System.out.println("----------");
		}
	}
}


public class ClassLevelLock {

	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		Thread th1 = new Thread(myClass1);
		
		MyClass myClass2 = new MyClass();
		Thread th2 = new Thread(myClass2);
		
		MyClass myClass3 = new MyClass();
		Thread th3 = new Thread(myClass3);
		
		th1.setName("Thread 1");
		th2.setName("Thread 2");
		th2.setName("Thread 3");
		
		th1.start();
		th2.start();
		th3.start();

	}
}
