package com.aksh.multi.threading;

public class SleepDemo {
	public static void main(String[] args) {
		for (int i = 2; i >= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
