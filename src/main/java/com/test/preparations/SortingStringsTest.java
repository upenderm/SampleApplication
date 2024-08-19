package com.test.preparations;

import java.util.Arrays;
import java.util.List;

public class SortingStringsTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mumbai", "Nagpur", "Hyderabad", "Aurangabad", "Ahmedabad", "Hyderabad",
				"Warangal", "Vijayawada", "Vishakapatnam", "Chennai", "Bangalore", "New Delhi", "Calcutta",
				"Trivendrum", "Tirupathi", "Mysore", "Karimnagar", "Nagpur");
		
		list.sort((a,b)->a.compareTo(b));
		list.forEach(System.out::println);
	}

}
