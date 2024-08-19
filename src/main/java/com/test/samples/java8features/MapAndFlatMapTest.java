package com.test.samples.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapTest {

	public static void main(String[] args) {
		List<Institute> list = new ArrayList<>();
		list.add(new Institute("IIT", Arrays.asList("Delhi", "Calcutta", "Mumbai", "Chennai")));
		list.add(new Institute("IIM", Arrays.asList("Delhi", "Mumbai")));
		list.add(new Institute("NIT", Arrays.asList("Warangal", "Roorkee", "Hyderabad", "Bangalore")));
		System.out.println("****** Map results *************");
		list.stream().map(Institute::getLocations).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("****** Flat Map results *************");
		list.stream().flatMap(a -> a.getLocations().stream()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("****** Print objects as is *************");
		list.stream().forEach(System.out::println);
	}

}
