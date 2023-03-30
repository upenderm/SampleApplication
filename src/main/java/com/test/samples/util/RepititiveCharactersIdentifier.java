package com.test.samples.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepititiveCharactersIdentifier {

	public static void main(String[] args) {
		String str = "aaaaaaaabbaacccccccccccccbbbbbbbbbbbbdddddddeeeeebffffff";
		RepititiveCharactersIdentifier identifier = new RepititiveCharactersIdentifier();
		identifier.identifyRepititiveCharacters(str);
	}

	private void identifyRepititiveCharacters(String str) {
		System.out.println("******************");
		List<Character> list = new ArrayList<>();
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			list.add(chars[i]);
		}
		Set<Character> set = new HashSet<>(list);
		for (char s : set) {
			System.out.println(s + " >------> " + Collections.frequency(list, s));
		}
	}

}
