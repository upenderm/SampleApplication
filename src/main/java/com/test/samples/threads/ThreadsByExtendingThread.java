package com.test.samples.threads;

public class ThreadsByExtendingThread extends Thread {
	int limit = 0;
	String message = "*";
	
	public ThreadsByExtendingThread(int limit, String message) {
		this.limit=limit;
		this.message = message;
	}

	@Override
	public void run() {
		printNumbers();
	}
	
	private synchronized void printNumbers(){
		for (int i = 0; i < limit; i++) {
			System.out.println(i + message);
		}
	}

	public static void main(String[] args) {
		ThreadsByExtendingThread tet = new ThreadsByExtendingThread(100, "AAAAAA");
		tet.start();
		ThreadsByExtendingThread tet2 = new ThreadsByExtendingThread(90, "BBBBBB");
		tet2.start();
		ThreadsByExtendingThread tet3 = new ThreadsByExtendingThread(95, "CCCCCC");
		tet3.start();
	}

}
