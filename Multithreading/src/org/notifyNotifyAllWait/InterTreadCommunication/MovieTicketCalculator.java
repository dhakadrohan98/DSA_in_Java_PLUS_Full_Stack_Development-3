package org.notifyNotifyAllWait.InterTreadCommunication;

public class MovieTicketCalculator {

	public static void main(String[] args) throws InterruptedException {
		CalculatingRevenue th1 = new CalculatingRevenue();
		th1.start();
		synchronized (th1) {
			th1.wait();
		}
		System.out.println("Revenue of 10 tickets: " + th1.total + "rs");

	}

}
	