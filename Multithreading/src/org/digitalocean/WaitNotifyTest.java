package org.digitalocean;

public class WaitNotifyTest {
	public static void main(String[] args) {
		Message msg = new Message("process it with the first message");
		
		Waiter waiter1 = new Waiter(msg);
		Thread wtTH1 = new Thread(waiter1, "waiter1");
		wtTH1.start();
		Waiter waiter2 = new Waiter(msg);
		Thread wtTH2 = new Thread(waiter2, "waiter2");
		wtTH2.start();
		//Two threads are owning monitor on Message object. waiting to get notify through another thread.
		
		Notifier notifier1 = new Notifier(msg);
		Thread ntTH1 = new Thread(notifier1, "notifier1");
		System.out.println("All the threads are started");
		ntTH1.start();
	}
}
