package com.aksh.multi.threading;

public class ThreadMethods  extends Thread{

	public void run() {
		System.out.println("THread Task. is executed by."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
//		JVM Create main thread
		
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());// by default thread name is "main"
		Thread.currentThread().setName("Akash Thread");//we can change the thread name
		System.out.println(Thread.currentThread().getName());
		
		ThreadMethods t=new ThreadMethods();
		t.start();
		

	}
}
