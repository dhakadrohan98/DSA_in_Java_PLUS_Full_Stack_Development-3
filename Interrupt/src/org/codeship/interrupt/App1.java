package org.codeship.interrupt;

public class App1 {
	static public int balance = 5000;
 
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0 || balance < amount) {
				try {
					System.out.println("Initial balance is: " +balance);
					System.out.println("Waiting for balance updation");
					wait();
				} catch (InterruptedException e) {
					System.out.println("original balance: "+balance);
					System.out.println("Withdrawal amount: "+amount);
					balance = balance - amount;
					System.out.println("Withdrawal successful and the current balance is: " + balance);
					
				}
			}else{
				System.out.println("Current balance is greater than withdrawl amount");
				System.out.println("We are inside else");
				
			}
		}
		
	}
 
	public void deposit(int amount) {
		System.out.println("We are depositing the amount "+amount);
		balance = balance + amount;
		System.out.println("Now current balance is: " +balance);
	  
	}
 
	public static void main(String[] args) {
		App1 app = new App1();
 
		Thread thread1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				app.withdraw(1000);
 
			}
		});
		thread1.start();
 
		Thread thread2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
				thread1.interrupt();
			}
		});
		thread2.start();
 
	}
}

