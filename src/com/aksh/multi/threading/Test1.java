package com.aksh.multi.threading;

public class Test1 extends Thread {
	public void run() {
		System.out.println("Single Thread and Single Task");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();// single Thread created
		t.start();
		Test1 t2=new Test1();
		t2.start();
	}
}