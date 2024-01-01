package org.practice;

public class RunnableInterfaceExample implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + ": "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Runnable runnable = new RunnableInterfaceExample();
		Thread th1 = new Thread(runnable, "thr1");
		Thread th2 = new Thread(runnable, "thr2");
		Thread th3 = new Thread(runnable, "thr3");
		System.out.println("Thread 1 is starting");
		th1.start();
		try {
			th1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 is starting");
		th2.start();
		try {
			th2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 3 is starting");
		th3.start();
		try {
			th3.join();
			System.out.println("All thread has been executed successfully");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
