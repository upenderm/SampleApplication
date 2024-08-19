package com.test.preparations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		Integer[] numArr = {1,2,3,4,5,6,0,-1,-2,-3,7,7,8,9,12};
		Arrays.asList(numArr).stream().map(a -> a<0?(a*-1):a).forEach(System.out::println);
		List<Integer> collect = Arrays.asList(numArr).stream().map(a -> a<0?(a*-1):a).collect(Collectors.toList());
		System.out.println(collect.stream().max((a,b)->a.compareTo(b)).get());
		
		List<Integer> list = new ArrayList<>();
		List<Integer> collect2 = Arrays.asList(numArr).stream().map(a -> a<0?(a*-1):a).filter(a -> {
			if(list.contains(a)) {
				return true;
			} else {
				list.add(a);
			}
			return false;
		}).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
