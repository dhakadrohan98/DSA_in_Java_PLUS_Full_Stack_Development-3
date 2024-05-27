package org.synchronization.mutualExclusive;

public class BookTheaterSeat {
	int totalSeat = 10;

	void bookSeat(int seats) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		//synchronized
		synchronized(this) {
			if (seats <= totalSeat) {
				System.out.println(seats + " Seats booked successfully");
				totalSeat -= seats;
				System.out.println("Seats left: " + totalSeat);
			} else {
				System.out.println("Seats can not be booked");
				System.out.println("Seats left: " + totalSeat);
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
