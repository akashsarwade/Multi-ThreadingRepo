package com.aksh.multi.threading;

public class DeamonThreadDemo extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Deamon Thread.");

		} else {

			System.err.println("Child Thread..");
		}
	}

	public static void main(String[] args) {

		System.out.println("Main thread");
		DeamonThreadDemo d = new DeamonThreadDemo();
		d.setDaemon(true);// I make thread to daemon Thread
		d.start();

	}
}