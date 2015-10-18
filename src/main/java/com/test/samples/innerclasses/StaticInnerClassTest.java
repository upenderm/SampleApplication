package com.test.samples.innerclasses;

public class StaticInnerClassTest {

	int x = 10;
	static int y = 5;

	public String outerClassMethod() {
		System.out.println("I'm in outerClassMethod");

		return "";
	}

	static class StaticInnerClass {
		int z = 20;

		public String innerClassMethod() {
//			System.out.println("x is :"+x);   // Compile error : static inner classes can only access static members of outer directly
			System.out.println("y is :"+y);
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println("Im in main method of SIC Test");
		StaticInnerClassTest.StaticInnerClass sin = new StaticInnerClassTest.StaticInnerClass();
		sin.innerClassMethod();
	}

}
