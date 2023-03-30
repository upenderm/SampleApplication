package com.test.samples.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class SortHalfAscendingSortHalfDescending {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 4, 7, 6, 3, 5, 8);
		Collections.sort(asList);
		for (int i = 0; i < asList.size() / 2; i++) {
			System.out.println(asList.get(i));
		}
		System.out.println("*********");
		for (int i = asList.size() - 1; i >= asList.size() / 2; i--) {
			System.out.println(asList.get(i));
		}
		System.out.println("---------------");
		asList.forEach(i -> {
			if(i <= asList.size()/2) {
			System.out.println(i);
			}
		});
		System.out.println("$$");
		ListIterator<Integer> listIterator = asList.listIterator(asList.size());
		Stream.generate(listIterator::previous).limit(asList.size()/2).forEach(System.out::println);
		System.out.println("-----------------");
		Stream.generate(asList.iterator()::next).limit(asList.size()/2).forEach(System.out::println);
	}

}
