package com.aksh.multi.threading;

public class SleepMethod extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethod sm = new SleepMethod();
		sm.start();
	}
}
