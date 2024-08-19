package com.test.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld extends App{

	public HelloWorld() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		List<Integer> list = Arrays.asList(1,3,4,5,6,9,2,4,56,6,6);
		List<Integer> collect = list.stream().sorted((a,b) ->a.compareTo(b)).collect(Collectors.toList());
		collect.forEach(System.out::print);
		String key = "A";
		System.out.println("---------------------");
		System.out.println(">>---->"+key.hashCode());
		System.out.println(key.hashCode() & 15);
	}

}
