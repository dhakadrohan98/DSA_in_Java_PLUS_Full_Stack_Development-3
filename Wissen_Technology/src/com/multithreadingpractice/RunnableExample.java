package com.multithreadingpractice;

class RunnableInterface implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		RunnableInterface runnable = new RunnableInterface();
		Thread th1 = new Thread(runnable, "Rohan1");
		Thread th2 = new Thread(new RunnableInterface(), "Rohan2");
		Thread th3 = new Thread(new RunnableInterface(), "Rohan3");
		th1.start();
		
		th1.join();
		System.out.println("Thread 1 has been executed successfully");
		th2.start();
		th2.join();
		System.out.println("Thread 2 has been executed successfully");
		th3.start();
		th3.join();
		System.out.println("Thread 3 has been executed successfully");
		System.out.println("All thread has been executed successfully");
		
	}

}
