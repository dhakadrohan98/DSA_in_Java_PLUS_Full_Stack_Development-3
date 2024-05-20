package com.ObjectLock;

public class ObjectLock {

	public synchronized void m1() {
		System.out.println("In method M1() and Thread name is " + Thread.currentThread().getName());
	}

	public synchronized void m2() {
		System.out.println("In method M2() and Thread name is " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ObjectLock objectLock = new ObjectLock();
		Thread1 th1 = new Thread1(objectLock);
		Thread2 th2 = new Thread2(objectLock);

		th1.start();
		th2.start();
	}
}

class Thread1 extends Thread {
	ObjectLock object = null;

	Thread1(ObjectLock object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}

class Thread2 extends Thread {
	ObjectLock object = null;

	Thread2(ObjectLock object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.m1();
		object.m2();
	}
}