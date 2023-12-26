package org.digitalocean;

public class WaitNotifyTest {
	public static void main(String[] args) {
		Message msg = new Message("process it");
		Waiter waiter1 = new Waiter(msg);
		Thread wt1 = new Thread(waiter1, "waiter1");
		wt1.start();
		Waiter waiter2 = new Waiter(msg);
		Thread wt2 = new Thread(waiter2, "waiter2");
		wt2.start();
		
		Notifier notifier1 = new Notifier(msg);
		Thread nt1 = new Thread(notifier1, "notifier1");
		System.out.println("All the threads are started");
		nt1.start();
	}
}
