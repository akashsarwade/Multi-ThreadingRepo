package com.aksh.multi.threading;

public class JoinDemo extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo j = new JoinDemo();
		j.start();
		j.join();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
