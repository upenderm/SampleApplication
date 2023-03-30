package com.test.samples.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.test.samples.model.Fruits;

public class GroupByElements {

	public static void main(String[] args) {
		List<Fruits> list = new ArrayList<>();
		list.add(new Fruits(100, "Apple Regular"));
		list.add(new Fruits(200, "Bananna"));
		list.add(new Fruits(75, "Citrus"));
		list.add(new Fruits(50, "Apple Green"));
		list.add(new Fruits(500, "Oranges orange"));
		list.add(new Fruits(110, "Grapes"));
		list.add(new Fruits(10, "Promogranate"));
		list.add(new Fruits(400, "Apple Yellow"));
		list.add(new Fruits(320, "Water melon"));
		list.add(new Fruits(550, "Oranges green"));
		list.add(new Fruits(650, "Lemon"));

		Map<String, List<Fruits>> collect = list.stream()
				.collect(Collectors.groupingBy(Fruits::getFruitName, TreeMap::new, Collectors.toList()));
		collect.values().forEach(System.out::println);
		
		

	}

}
