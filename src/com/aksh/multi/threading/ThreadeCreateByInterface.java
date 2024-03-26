package com.aksh.multi.threading;
//This is Better way to create thread class

//1. Implement Runnable interface
public class ThreadeCreateByInterface implements Runnable {

	// 2. Override run() method
	@Override
	public void run() {
		System.out.println("run() method Override");
	}

	public static void main(String[] args) {
		// 3. Create Object
		ThreadeCreateByInterface th = new ThreadeCreateByInterface();
		Thread t = new Thread(th);//4. create Thread class object and pass reference of class object
		t.start();//5. call method start()
		

	}
}
