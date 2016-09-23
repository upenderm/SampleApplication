package com.test.samples;

public class StaticVolatileTest {

	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.batsman = 3;
		c.score = 28;
		Cricket.fielders = 11;
		System.out.println(c.batsman);
		System.out.println(c.score);
		System.out.println(Cricket.fielders);
		System.out.println("------------------------");
		Cricket c2 = new Cricket();
		System.out.println(c2.batsman);
		System.out.println(c2.score);
		System.out.println(Cricket.fielders);

	}

}

class Cricket {
	int batsman = 2;
	volatile int score = 22;
	static int fielders = 10;
}