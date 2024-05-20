package org.synchronization.mutualExclusive;

public class BookTheaterSeat {
	int totalSeat = 10;

	void bookSeat(int seats) {
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		synchronized(this) {
			if(seats <= totalSeat) {
				System.out.println(seats + " Seats booked successfully");
				totalSeat -= seats;
				System.out.println("Seats left: " + totalSeat);
			}
			else {
				System.out.println("inside else block");
				System.out.println("Seats is not booked");
			}
		}
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
		System.out.println("thread no. " + Thread.currentThread().getName());
	}
}
