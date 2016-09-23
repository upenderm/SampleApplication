package com.test.samples;

import java.util.HashSet;

import com.test.samples.model.Fruits;

public class HashCodeAndEqualsTest {

	public static void main(String[] args) {
		Fruits f1 = new Fruits(5, "Apple");
		Fruits f2 = new Fruits(5, "Apple");
		System.out.println(f1.hashCode());
		System.out.println(f1.equals(f2));

		HashSet<Fruits> hs = new HashSet<Fruits>();
		hs.add(f1);
		hs.add(f2);
		System.out.println(hs.size());

		System.out.println(f1 == f2); // This will never be equal, even you
										// override equals and hashcode
	}

}
