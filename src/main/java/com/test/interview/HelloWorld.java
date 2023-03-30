package com.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HelloWorld {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 101, 2, 6, 95, 12, 10, 10, 10, 10, 10, 10, 10, 6);

		List<Integer> collect = list.stream().filter(i -> {
			int j = 0;
			System.out.println(i / 10);
			while (true) {
				if (i / 10 < 9) {

					j = i / 10;
					break;
				} else {
					i = i / 10;
				}
			}
			if (j == 1) {
				return true;
			}

			return false;
		}).collect(Collectors.toList());

		System.out.println(">---->" + collect);
		int i = 545824;
		int j = 0;
		System.out.println(i / 10);
		while (true) {
			if (i / 10 < 9) {

				j = i / 10;
				break;
			} else {
				i = i / 10;
			}
		}
		System.out.println(j);

		Set<Integer> strSet = new HashSet<Integer>();

		Set<Integer> collect2 = list.stream().filter(a -> {
			if (strSet.contains(a)) {
				return true;
			} else {
				strSet.add(a);
			}
			return false;
		}).collect(Collectors.toSet());

		System.out.println(">---------------->" + collect2);

		List<Integer> asList = Arrays.asList(1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10, 1, 22, 33, 5, 677, 8, 9);
		List<Integer> asList2 = new ArrayList<>();
		Set<Integer> set2 = asList.stream().filter(a -> {
			if (asList2.contains(a)) {
				return true;
			} else {

				asList2.add(a);
			}
			return false;
		}).collect(Collectors.toSet());

		System.out.println("*****" + set2);

	}

}
