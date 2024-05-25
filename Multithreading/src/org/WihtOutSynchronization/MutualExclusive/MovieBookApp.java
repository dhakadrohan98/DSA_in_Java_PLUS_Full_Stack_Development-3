package org.WihtOutSynchronization.MutualExclusive;

public class MovieBookApp extends Thread {
	//class variable of BookTheaterSeat type
		static BookTheatreSeat b;
		int seats;
		
		@Override
		public void run() {
			b.bookSeat(seats);
		}
		
		public static void main(String[] args) {
			//creating instance of BookTheaterSeat
			b = new BookTheatreSeat();
			//creating instance of MovieBookApp thread class
			MovieBookApp deepak = new MovieBookApp();
			deepak.seats = 6;
			deepak.start();
			
			MovieBookApp diksha = new MovieBookApp();
			diksha.seats = 7;
			diksha.start();
		}
}
