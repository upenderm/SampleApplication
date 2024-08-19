package com.test.samples.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationsTest {

	public static void main(String[] args) {
		System.out.println("Hello......This test is using Set and HashSet.");
		Set<Integer> st = new HashSet<>();
		st.add(5);
		st.add(6);
		st.add(7);
		st.add(5);
		st.add(1);
		st.add(4);
		st.add(3);
		st.add(2);

		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Hello......This test is using Set and LinkedHashSet");
		Set<Integer> st5 = new LinkedHashSet<>();
		st5.add(5);
		st5.add(6);
		st5.add(7);
		st5.add(5);
		st5.add(1);
		st5.add(4);
		st5.add(3);
		st5.add(2);

		Iterator<Integer> it5 = st5.iterator();
		while (it5.hasNext()) {
			System.out.println(it5.next());
		}

		Set<Item> st2 = new HashSet<>();
		Item d1 = new Item(5, "Ramu");
		Item d2 = new Item(6, "Somu");
		Item d3 = new Item(7, "Bheemu");
		st2.add(d1);
		st2.add(d2);
		st2.add(d3);
		st2.add(d1);

		Iterator<Item> it2 = st2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println("Hello......This test is using Set and TreeSet");
		Set<Integer> st3 = new TreeSet<>();
		st3.add(5);
		st3.add(6);
		st3.add(7);
		st3.add(5);
		st3.add(1);
		st3.add(4);
		st3.add(3);
		st3.add(2);

		Iterator<Integer> it3 = st3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		// To add an Object to Treeset ... make sure the object is implementing the
		// Comparable interface. Else it will be a Runtime error.
		Set<Item> st4 = new TreeSet<>();
		Item d4 = new Item(51, "Ramu");
		Item d5 = new Item(61, "Somu");
		Item d6 = new Item(71, "Bheemu");
		st4.add(d4);
		st4.add(d5);
		st4.add(d6);

		Iterator<Item> it4 = st4.iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());
		}
	}

}
