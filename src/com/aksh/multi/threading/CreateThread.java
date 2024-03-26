package com.aksh.multi.threading;

//Steps to Create Thread
//1. Extend Thread class
//2. Override run method
//3. Create object of class
//4. Invoke thread by calling start() method

public class CreateThread extends Thread {//extend THread predefined class

	public void run() {//override run() method
		System.out.println("I am RUn method of THread");
	}

	public static void main(String[] args) {
		CreateThread ob = new CreateThread();//object create
		
		ob.start();//run() method will get call by start() method
//		ob.start();this is exception we can't call thread 2nd time it goes to dead stage
		
	}
}
