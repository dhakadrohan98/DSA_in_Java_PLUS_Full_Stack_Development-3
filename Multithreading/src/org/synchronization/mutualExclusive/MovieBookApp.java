package org.synchronization.mutualExclusive;

public class MovieBookApp extends Thread {
	//variable of BookTheaterSeat type
	static BookTheaterSeat b;
	int seats;
	
	@Override
	public void run() {
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) {
		//creating instance of BookTheaterSeat
		b = new BookTheaterSeat();
		//creating instance of MovieBookApp thread class
		MovieBookApp deepak = new MovieBookApp();
		deepak.seats = 6;
		deepak.start();
		
		MovieBookApp diksha = new MovieBookApp();
		diksha.seats = 3;
		diksha.start();
	}
}
