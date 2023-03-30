package com.test.samples.java8features;

public class MyFunctionalInterfaceImpl {

	public static void main(String[] args) {

		System.out.println(doMathOperation(2, 3, (a, b) -> a + b));
		System.out.println(doMathOperation(2, 3, (a, b) -> a * b));
	}

	public static int doMathOperation(int a, int b, MyFunctionalInterface operation) {

		return operation.drawShape(a, b);
	}
}
