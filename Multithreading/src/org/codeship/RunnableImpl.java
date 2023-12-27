package org.codeship;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " value: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableImpl());
		Thread t2 = new Thread(new RunnableImpl());
		
		t1.start();
		t2.start();

	}

}
