package org.codeship.multithread;

class TotalEarning implements Runnable {
	
	int total =0;
	
		@Override
		public void run() {
			synchronized(this) {
				for(int i=1; i<=10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					total = total + 100;
					System.out.println("Total- " + i + ": " + total);
				}
				this.notify();
			}
		}
	
	
}

//MovieBooking class
public class WaitNotifyExample {

	public static void main(String[] args) {
		TotalEarning te = new TotalEarning();
		Thread th = new Thread(te);
		
		th.start();
		synchronized (te) {
			try {
				te.wait();
				System.out.println("Final total:" + te.total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
