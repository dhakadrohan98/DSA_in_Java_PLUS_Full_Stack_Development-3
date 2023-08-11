package org.codeship;

public class App {
	public int counter = 0;
 
	public static void main(String[] args) {
		App app = new App();
 
		Thread thread1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
 
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
 
			}
		});
 
		Thread thread2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
 
			}
		});
		thread1.start();
		thread2.start();
 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		System.out.println("The value of counter: " + app.counter);
	}
 
}