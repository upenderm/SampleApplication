package com.test.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		findDuplicateNumbers();
		findDuplicateInts();
	}

	private static void findDuplicateNumbers() {

		String[] strArr = { "1, 3, 4, 7, 13", "1, 2, 4, 13, 15" };

		List<String> list1 = Arrays.asList(strArr[0].split(","));
		List<String> list2 = Arrays.asList(strArr[1].split(","));

		list1.stream().filter(a -> {
			if (list2.contains(a)) {
				System.out.println(">---------------->>>" + a);
				return true;
			}
			return false;
		}).collect(Collectors.toList());

	}
	
	private static void findDuplicateInts() {
		Integer ir[] = {1,2,3,4,5,6,7,8,9};
		Integer ir2[] = {4,5,6,10,11,12};
		List<Integer> collect = Arrays.asList(ir).stream().filter(a -> {
			if(Arrays.asList(ir2).contains(a)) {
			return true;
			} 
			return false;
		}).collect(Collectors.toList());
		System.out.println(">>---->"+collect);
	}

}
