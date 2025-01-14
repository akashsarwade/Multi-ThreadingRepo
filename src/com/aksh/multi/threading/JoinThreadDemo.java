package com.aksh.multi.threading;

class Medical extends Thread {

	public void run() {
		try {
			System.out.println("Medical Start.");
			Thread.sleep(2000);
			System.out.println("Medical Completed.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread {

	public void run() {
		try {
			System.out.println("Drive Test Start.");
			Thread.sleep(5000);
			System.out.println("Drive Test Completed.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread {

	public void run() {
		try {
			System.out.println("Officer Takes the File .");
			Thread.sleep(5000);
			System.out.println("Officer Validate Docs and Completed Verification.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class JoinThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		Medical m = new Medical();
		m.start();
		m.join();

		TestDrive td = new TestDrive();
		td.start();
		td.join();

		OfficerSign of = new OfficerSign();
		of.start();
	}
}
