package com.aksh.multi.threading;

class BookTheaterSeat {
	
	int totalSeat = 20;

	 synchronized void bookSeat(int seats) {
		if (totalSeat >= seats) {
			System.out.println(seats + " Seat Booked Successfully.");
			totalSeat = totalSeat - seats;
			System.out.println("Seats Left" + seats);

		} else {
			System.out.println("Seats Cann't book");
			System.out.println("Seats Leaft:" + seats);
		}
	}
}

public class MovieBookApp extends Thread {

	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		b = new BookTheaterSeat();
		MovieBookApp aksh = new MovieBookApp();
		aksh.seats = 10;
		aksh.start();

		MovieBookApp sham = new MovieBookApp();
		sham.seats = 4;
		sham.start();
	}
}
