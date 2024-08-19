package com.test.preparations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RepititiveStringIntegerCharacterTest {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Mumbai", "Nagpur", "Hyderabad", "Aurangabad", "Ahmedabad", "Hyderabad",
				"Warangal", "Vijayawada", "Vishakapatnam", "Chennai", "Bangalore", "New Delhi", "Calcutta",
				"Trivendrum", "Tirupathi", "Mysore", "Karimnagar", "Bangalore", "Calcutta", "Hyderabad");
		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4, 2, 1, 2, 4, 9, 5, 6, 765, 4, 3, 4, 5, 67, 8, 8, 99876, 5, 4,
				3, 3, 232, 4, 576, 9);
		String str = "aaaabbbcdddddmddddeefffffggggggaaaaazzzeefswetoiewjioesd";
		identifyRepititiveStrings(asList);
		identifyRepititiveIntegers(asList2);
		identifyRepititiveCharacters(str);
		identifySequentialRepititiveCharacters(str);
	}

	private static void identifySequentialRepititiveCharacters(String str) {
		char[] charArray = str.toCharArray();
		int count = 1;
		int maxCount = 1;
		char maxChar = str.charAt(0);
		char currentChar = str.charAt(0);

		for (int i = 1; i < charArray.length; i++) {
			if (currentChar == charArray[i]) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxChar = currentChar;
				}
				count = 1;
				currentChar = charArray[i];
			}
		}
		System.out.println(">>------->" + maxChar);
	}

	private static void identifyRepititiveCharacters(String str) {

		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		collect.forEach((k, v) -> System.out.println(k + ":" + v));
	}

	private static void identifyRepititiveIntegers(List<Integer> asList2) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = asList2.stream().filter(a -> {
			if (list.contains(a)) {
				return true;
			} else {
				list.add(a);
			}
			return false;
		}).collect(Collectors.toSet());
		System.out.println(set);
	}

	private static void identifyRepititiveStrings(List<String> asList) {
		List<String> list = new ArrayList<>();

		Set<String> collect = asList.stream().filter(a -> {
			if (list.contains(a)) {
				return true;
			} else {
				list.add(a);
			}
			return false;
		}).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
