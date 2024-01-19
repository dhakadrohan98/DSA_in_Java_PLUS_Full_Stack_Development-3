package org.digitalocean;

public class Notifier implements Runnable {

	private Message msg;
	
	//Injecting object of Message into Notifier class's constructor.
	public Notifier(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " has been started");
		try {
			Thread.sleep(2000);
			synchronized (msg) {
				msg.setMsg(threadName +"-> notifier work done");
//				msg.notify();
				msg.notifyAll();
			}
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}
}
