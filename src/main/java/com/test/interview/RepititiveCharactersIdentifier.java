package com.test.interview;

import java.util.HashMap;
import java.util.Map;

public class RepititiveCharactersIdentifier {

	public static void main(String[] args) {
		String str = "aaaaaaaabbaacccccccccccccbbbbbbbbbbbbdddddddeeeeebffffff";
		RepititiveCharactersIdentifier obj = new RepititiveCharactersIdentifier();
		obj.identifyRepitiveCharacters(str);
		obj.identifySequentialRepitiveCharacters(str);
	}

	private void identifySequentialRepitiveCharacters(String str) {
		char[] chars = str.toCharArray();
		int count = 1;
		int maxCount = 1;
		char currentCharacter = chars[0];
		char maxCharacter = chars[0];

		for (int i = 1; i < chars.length; i++) {
			if (currentCharacter == chars[i]) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxCharacter = currentCharacter;
				}
				count = 1;
				currentCharacter = chars[i];
			}
		}
		System.out.println("Most sequentially repeated character is :" + maxCharacter);
	}

	private void identifyRepitiveCharacters(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println("Final result =" + map);
	}

}
