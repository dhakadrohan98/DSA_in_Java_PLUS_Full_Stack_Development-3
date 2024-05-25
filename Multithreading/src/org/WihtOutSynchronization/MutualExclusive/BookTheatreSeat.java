package org.WihtOutSynchronization.MutualExclusive;

public class BookTheatreSeat {
	int totalSeat = 10;
	//synchronized method
	synchronized void bookSeat(int seats) {
		if (seats <= totalSeat) {
			System.out.println(seats + " Seats booked successfully");
			totalSeat -= seats;
			System.out.println("Seats left: " + totalSeat);
		} else {
			System.out.println("Seats can not be booked");
			System.out.println("Seats left: " + totalSeat);
		}
	}
}
