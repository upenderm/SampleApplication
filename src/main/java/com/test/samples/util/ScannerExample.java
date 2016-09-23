package com.test.samples.util;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out
					.println("Hello. This is a Java scanner example. Please enter a string");
			String str = scan.nextLine();
			System.out.println("You entered :" + str);
		}
	}

}
