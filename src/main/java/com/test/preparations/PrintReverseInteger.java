package com.test.preparations;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class PrintReverseInteger {

	public static void main(String[] args) {
		printReverseOfInteger(123456);
		printReverseOfString("Hello World");
		printReverseOfWordsInString("Hello World");
	}

	private static void printReverseOfWordsInString(String string) {
		Arrays.asList(string.split(" ")).stream().map(s -> StringUtils.reverse(s) + " ").forEach(System.out::print);
	}

	private static void printReverseOfString(String string) {
		System.out.println("Given string is :" + string);
		System.out.println("Reverse string is :" + StringUtils.reverse(string));
	}

	private static void printReverseOfInteger(int givenNumber) {
		System.out.println("Given number is :" + givenNumber);
		int reverseNumber = 0;
		while (givenNumber != 0) {
			reverseNumber = (reverseNumber * 10) + (givenNumber % 10);
			givenNumber = givenNumber / 10;
		}
		System.out.println("Reverse number is :" + reverseNumber);
	}

}
