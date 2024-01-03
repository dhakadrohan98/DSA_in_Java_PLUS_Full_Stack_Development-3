package org.codeship;

public class Waiter implements Runnable {
	private Message message;

	public Waiter(Message message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Inside waiter class");
		String name = Thread.currentThread().getName();
		
		synchronized (message) {
			
			try {
				System.out.println(name + " wait() method started at "+System.currentTimeMillis());
				this.message.wait();
				System.out.println(name + " wait() method ended at "+System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//process the message now
			System.out.println("Message(from waiter "+Thread.currentThread().getName()+" class) is "+ this.message.getName());
		}
	}
}
