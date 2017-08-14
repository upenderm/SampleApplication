package com.test.samples.threads;

public class ThreadsByImplementingRunnable implements Runnable {

	int limit = 0;
	String msg = "";

	public static void main(String[] args) {
		ThreadsByImplementingRunnable tr = new ThreadsByImplementingRunnable();
		tr.limit = 75;
		tr.msg = "AAAAAAAAAAAA";
		Thread t = new Thread(tr);
		ThreadsByImplementingRunnable tr2 = new ThreadsByImplementingRunnable();
		tr2.limit = 85;
		tr2.msg = "BBBBBBB";
		Thread t2 = new Thread(tr2);
		ThreadsByImplementingRunnable tr3 = new ThreadsByImplementingRunnable();
		tr3.limit = 95;
		tr3.msg = "CCCC";
		Thread t3 = new Thread(tr3);
		t.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println(i + msg);
		}

	}

}
