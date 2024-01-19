package org.codeship.multithread;

public class Multithread implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("current thread: "+ Thread.currentThread().getName() +
						"-> "+(i+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Multithread mlth1 = new Multithread();
		Multithread mlth2 = new Multithread();
		Multithread mlth3 = new Multithread();
		Thread th1 = new Thread(mlth1,"RohanThread1");
		Thread th2 = new Thread(mlth1,"RohanThread2");
		Thread th3 = new Thread(mlth1,"RohanThread3");
		th1.start();
		try {
			th1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();
		
		try {
			th2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		th3.start();
		try {
			th3.join();
			System.out.println("All Threads executed successfully");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
