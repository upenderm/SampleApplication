package com.test.preparations;

import java.util.Arrays;
import java.util.List;

public class SortingIntegersTest {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 3, 45, 5, 2, 9, 8, 3, 6, 4, 0, 7, 19, 10, 20);

		asList.sort((a, b) -> a.compareTo(b));
		System.out.print("Sorted List Increasing Order :");
		asList.forEach(s -> System.out.print(s + ", "));

		asList.sort((a, b) -> b.compareTo(a));
		System.out.print("\nSorted List Decreasing Order :");
		asList.forEach(s -> System.out.print(s + ", "));

		System.out.println("\nTotal : " + asList.stream().reduce(Integer::sum).get());
		System.out.println("Integers starting with 1");
		asList.stream().map(s -> s.toString()).filter(s -> s.startsWith("1")).forEach(System.out::println);

		System.out.println("Maximum element in given list is :" + asList.stream().max((a, b) -> a.compareTo(b)).get());

		asList.stream().filter(a -> a % 2 == 0).forEach(System.out::println);

	}

}
