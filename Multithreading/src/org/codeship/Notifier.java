package org.codeship;

public class Notifier implements Runnable {

	private Message message;
	
	
	public Notifier(Message message) {
		super();
		this.message = message;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			Thread.sleep(2000);
			
			synchronized (message) {
				System.out.println("Notify method is invoking");
				this.message.notifyAll();
				System.out.println("Notify method is ended");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Notifer class work done");
		
	}
	
}
