package org.notifyNotifyAllWait.InterTreadCommunication;

import java.lang.Object;

public class CalculatingRevenue extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized(this) {
			for (int i = 1; i <= 10; i++) {
				total += 100;
			}
			this.notify();
		}
	}
}
