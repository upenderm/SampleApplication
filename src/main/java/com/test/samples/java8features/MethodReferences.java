package com.test.samples.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class MethodReferences {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("chennai", "hyderabad", "mumbai", "bangalore", "calcutta", "NewDELHI");
		methodReferenceToStatic(list);
		System.out.println("-----------------------------------------");
		methodReferenceToNonStatic(list);
		System.out.println("=========================================");
		methodReferenceToConstructor(list);

	}

	private static void methodReferenceToStatic(List<String> list) {

		System.out.println(list);
		list.forEach(str -> {
			System.out.println(StringUtils.capitalize(str) + ":" + str.toUpperCase());
		});
		list.forEach(StringUtils::capitalize);
		list.forEach(e -> System.out.println(e));

	}

	private static void methodReferenceToNonStatic(List<String> list) {
		Stream.generate(list.iterator()::next).limit(list.size()).forEach(System.out::println);
	}

	private static void methodReferenceToConstructor(List<String> list) {
		List<String> subList = list.stream().collect(Collectors.toList()).subList(0, list.size() / 2);
		subList.forEach(System.out::println);
	}

}
