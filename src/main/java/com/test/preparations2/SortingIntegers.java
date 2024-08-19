package com.test.preparations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class SortingIntegers {

	public static void main(String[] args) {
		Integer[] intArr = { 3, 5, 6, 2, 5, 9, 5, 3, 5, 98, 76, 54, 3, 0, 4, 567, 89, 98, 876, 543, 2, 34, 567, 9, 864,
				2, 34, 56, 78, 6, 176 };
		String[] strArr = { "Mumbai", "Nagpur", "Hyderabad", "Aurangabad", "Ahmedabad", "Hyderabad", "Warangal",
				"Vijayawada", "Vishakapatnam", "Chennai", "Bangalore", "New Delhi", "Calcutta", "Trivendrum",
				"Tirupathi", "Mysore", "Karimnagar", "Nagpur" };

		String str = "Sometimes it's the first moment of the day that catches you off guard. That's what Wendy was thinking. She opened her window to see fire engines screeching down the street. While this wasn't something completely unheard of, it also wasn't normal. It was a sure sign of what was going to happen that day. She could feel it in her bones and it wasn't the way she wanted the day to begin.";
		String str2 = "aaaaaaaabbaacccccccccccccbbbbbbbbbbbbdddddddeeeeebffffff";
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(210, "EmployeeAOne", "Technical", 2000));
		empList.add(new Employee(658, "EmployeeKTen", "Technical", 8000));
		empList.add(new Employee(124, "EmployeeINine", "Accounts", 2135));
		empList.add(new Employee(657, "EmployeeBTwo", "Administration", 3000));
		empList.add(new Employee(321, "EmployeeHEight", "Technical", 4500));
		empList.add(new Employee(346, "EmployeeCThree", "Account", 6000));
		empList.add(new Employee(111, "EmployeeEFive", "Accounts", 4300));
		empList.add(new Employee(659, "EmployeeGSeven", "Administration", 1000));
		empList.add(new Employee(888, "EmployeeFSix", "Accounts", 5100));
		empList.add(new Employee(574, "EmployeeDFour", "Administration", 500));

		printAscendingOrderOfIntegers(intArr);
		printDescendingOrderOfIntegers(intArr);
		printSortedStrings(strArr);
		printReverseOfTheGivenString(str);
		printReverseOfTheGivenString(str, "");
		printReverseOfWordsInGivenString(str);
		printEvenNumbers(intArr);
		printHighestNumber(intArr);
		printLowestNumber(intArr);
		printTotalOfTheNumbers(intArr);
		printNumbersStartingWith1(intArr);
		printHalfListIncreasingHalfListDecreasing(intArr);
		printRepititiveIntegers(intArr);
		printRepititiveStrings(strArr);
		printRepititiveStringsInAString(str);
		printRepititiveCharactersInAString(str2);
		printEmployeesSortedBySalary(empList);
	}

	private static void printEmployeesSortedBySalary(List<Employee> empList) {
		empList.forEach(System.out::println);
		empList.stream().sorted((a,b) -> b.getSalary().compareTo(a.getSalary())).collect(Collectors.toList()).forEach(System.out::println);;
		
	}

	private static void printRepititiveCharactersInAString(String str) {
		Map<Character, Long> collect = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(collect);
	}

	private static void printRepititiveStringsInAString(String str) {
		Map<String, Long> collect = Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		collect.forEach((k, v) -> System.out.println(k + ">>>------>>" + v));
		Entry<String, Long> entry = collect.entrySet().stream()
				.max(Map.Entry.<String, Long>comparingByValue().thenComparingInt(e -> e.getKey().length())).get();
		System.out.println(
				"Highest repeated string: " + entry.getKey() + " is repeated no. of times:" + entry.getValue());

	}

	private static void printRepititiveStrings(String[] strArr) {
		Map<String, Long> collect = Arrays.asList(strArr).stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		collect.forEach((k, v) -> System.out.println(k + ">>>------>>" + v));

	}

	private static void printRepititiveIntegers(Integer[] intArr) {
		Map<Integer, Long> collect = Arrays.asList(intArr).stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		collect.forEach((k, v) -> System.out.println(k + "::::::" + v));

	}

	private static void printHalfListIncreasingHalfListDecreasing(Integer[] intArr) {
		System.out.println("Printing Half List Increasing and Half List Decreasing");
		List<Integer> sorted = Arrays.asList(intArr).subList(0, intArr.length / 2).stream()
				.sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		List<Integer> sorted2 = Arrays.asList(intArr).subList(intArr.length / 2, intArr.length - 1).stream()
				.sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(sorted + "::" + sorted2);
	}

	private static void printNumbersStartingWith1(Integer[] intArr) {
		System.out.println("Printing Numbers starting with One");
		List<String> collect = Arrays.asList(intArr).stream().map(s -> "" + s).filter(a -> a.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void printTotalOfTheNumbers(Integer[] intArr) {
		System.out.println("Printing Total");
		System.out.println(Arrays.asList(intArr).stream().reduce((a, b) -> a + b));

	}

	private static void printLowestNumber(Integer[] intArr) {
		System.out.println("Printing Lowest Number");
		System.out.println(Arrays.asList(intArr).stream().max((a, b) -> b.compareTo(a)));

	}

	private static void printHighestNumber(Integer[] intArr) {
		System.out.println("Printing Highest Number");
		System.out.println(Arrays.asList(intArr).stream().max((a, b) -> a.compareTo(b)));
	}

	private static void printEvenNumbers(Integer[] intArr) {
		System.out.println("***************************");
		List<Integer> collect = Arrays.asList(intArr).stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("***************************");
	}

	private static void printReverseOfWordsInGivenString(String str) {
		String resultString = Arrays.asList(str.split("\\s")).stream()
				.map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(resultString);
	}

	private static void printReverseOfTheGivenString(String str, String string) {
		List<String> collect = Arrays.asList(str).stream().map(a -> new StringBuilder(a).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void printReverseOfTheGivenString(String str) {
		System.out.println("Reversing the String using StringUtils API");
		System.out.println(StringUtils.reverse(str));
	}

	private static void printSortedStrings(String[] strArr) {
		List<String> collect = Arrays.asList(strArr).stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		List<String> collect2 = Arrays.asList(strArr).stream().sorted((a, b) -> b.compareTo(a))
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

	private static void printDescendingOrderOfIntegers(Integer[] intArr) {
		List<Integer> collect = Arrays.asList(intArr).stream().sorted().collect(Collectors.toList());
		Collections.sort(collect, Collections.reverseOrder());
		System.out.println(collect);
	}

	private static void printAscendingOrderOfIntegers(Integer[] intArr) {
		List<Integer> collect = Arrays.asList(intArr).stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

	}

}
