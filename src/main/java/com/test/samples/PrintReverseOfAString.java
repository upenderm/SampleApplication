package com.test.samples;

public class PrintReverseOfAString {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] c = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

}
