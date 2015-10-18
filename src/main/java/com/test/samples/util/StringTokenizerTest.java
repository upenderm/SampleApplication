package com.test.samples.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "Hello Mr. Anderson. How are you feeling today ?";
		StringTokenizer strt = new StringTokenizer(str, " ");
		System.out.println("Token count is :"+strt.countTokens());
		while(strt.hasMoreTokens()){
			System.out.println(strt.nextToken());
		}

	}
}
