package com.aksh.multi.threading;

class VLC extends Thread {
	public void run() {
		System.out.println("VLC Player started..");
	}
}
class Music extends Thread {
	public void run() {
		System.out.println("Music Player started..");
	}
}
class Game extends Thread {
	public void run() {
		System.out.println("Game Player started..");
	}
}
public class MultiTaskbyMultiThread {
	public static void main(String[] args) {
		VLC v = new VLC();
		v.start();

		Music m = new Music();
		m.start();

		Game g = new Game();
		g.start();
	}
}
