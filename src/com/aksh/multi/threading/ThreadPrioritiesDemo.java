package com.aksh.multi.threading;

public class ThreadPrioritiesDemo extends Thread {
	public void run() {

		// By default child thread priority is 5
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Child Thread:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// By default main thread priority is 5
		System.out.println("main thread:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);// 10
		ThreadPrioritiesDemo tp = new ThreadPrioritiesDemo();
		tp.setPriority(3);
		tp.start();
	}
}
