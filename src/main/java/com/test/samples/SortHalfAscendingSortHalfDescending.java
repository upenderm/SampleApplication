package com.test.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortHalfAscendingSortHalfDescending {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(9);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(7);
		list.add(1);
		list.add(10);
		Collections.sort(list);
		System.out.println("Sorted list is :" + list);
		System.out.println("Sorted list with first half ascending:");
		for (int i = 0; i < list.size() / 2; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Sorted list with second half descending:");
		for (int i = list.size() - 1; i >= list.size() / 2; i--) {
			System.out.println(list.get(i));
		}
		System.out.println("Now Using Collections");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list is :" + list);

	}

}
