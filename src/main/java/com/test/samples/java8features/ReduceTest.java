package com.test.samples.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> reduce = asList.stream().reduce(Integer::sum);
		if (reduce.isPresent()) {
			System.out.println(">>---------->" + reduce.get());
		}

		List<String> asList2 = Arrays.asList("c", "4", "n", "e", "t", "w", "o", "r", "k", "s");
		Optional<String> reduce2 = asList2.stream().reduce(String::concat);
		if (reduce2.isPresent()) {
			System.out.println(">>---------->" + reduce2.get());
		}

	}

}
