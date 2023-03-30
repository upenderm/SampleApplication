package com.test.samples.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepititiveIntegersIdentifier {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 2, 1, 2, 4, 9, 5, 6, 765, 4, 3, 4, 5, 67, 8, 8, 99876, 5, 4, 3,
				3, 232, 4, 576, 9);
		identifyDuplicates(asList);
		removeDuplicates(asList);
	}

	private static void identifyDuplicates(List<Integer> asList) {
		List<Integer> asList2 = new ArrayList<>();
		Set<Integer> collect = asList.stream().filter(a -> {
			if (asList2.contains(a)) {
				return true;
			} else {
				asList2.add(a);
			}
			return false;
		}).collect(Collectors.toSet());
		System.out.println("Duplicates are :" + collect);
	}

	private static void removeDuplicates(List<Integer> asList) {
		List<Integer> asList2 = new ArrayList<>();
		Set<Integer> collect = asList.stream().filter(a -> {
			if (!asList2.contains(a)) {
				return true;
			} else {
				asList2.add(a);
			}
			return false;
		}).collect(Collectors.toSet());
		System.out.println("Removed duplicates :" + collect);
	}
}
