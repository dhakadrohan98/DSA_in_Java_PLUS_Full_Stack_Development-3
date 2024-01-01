package org.codeship;

public class NotifierTest {

	public static void main(String[] args) {
		Message message = new Message("I am brilliant software developer");
		Waiter waiter1 = new Waiter(message); 
		Thread th1 = new Thread(waiter1, "waiter1");
		Waiter waiter2 = new Waiter(message); 
		Thread th2 = new Thread(waiter2, "waiter2");
		th1.start();
		th2.start();
		
		Notifier notifier1 = new Notifier(message);
		Thread th3 = new Thread(notifier1, "notifier1");
		th3.start();

	}

}
