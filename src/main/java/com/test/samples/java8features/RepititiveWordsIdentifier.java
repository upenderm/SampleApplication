package com.test.samples.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepititiveWordsIdentifier {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hyderabad", "WashingtonDC", "Hyderabad", "Newyork", "London");
		List<String> list2 = new ArrayList<>();

		Set<String> collect = list.stream().filter(a -> {
			if (list2.contains(a)) {
				return true;
			} else {
				list2.add(a);
			}
			return false;
		}).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
