package com.test.samples.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapTest2 {

	public static void main(String[] args) {
		
		List<Institute> list = new ArrayList<>();
		list.add(new Institute("IIT", Arrays.asList("Delhi", "Calcutta", "Mumbai", "Chennai")));
		list.add(new Institute("IIM", Arrays.asList("Delhi", "Mumbai")));
		list.add(new Institute("NIT", Arrays.asList("Warangal", "Roorkee", "Hyderabad", "Bangalore")));

		list.forEach(System.out::println);
		System.out.println("-----------------------------------");
		list.stream().map(a -> a.getLocations()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("*********************************************");
		list.stream().flatMap(a -> a.getLocations().stream()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
