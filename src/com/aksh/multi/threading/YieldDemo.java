package com.aksh.multi.threading;

public class YieldDemo extends Thread {

	public void run() {

//		Thread.yield();If you want to make stop this thread and run another thread
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

	public static void main(String[] args) {

		YieldDemo y = new YieldDemo();
		y.start();
		Thread.yield();// It stop the current executing thread and give chance to other thread for
						// execution

		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName() + ":" + j);
		}

	}
}
