package com.test.samples;

import java.util.HashSet;

import com.test.samples.model.Fruits;

public class HashCodeAndEqualsTest {

	public static void main(String[] args) {
		Fruits f1 = new Fruits(5, "Apple");
		Fruits f2 = new Fruits(5, "Apple");
		System.out.println("Hashcode for fruts2 obj is :" + f2.hashCode());
		System.out.println("Hashcode for fruts2 obj is :" + f2.hashCode());
		System.out.println("Hashcode for fruts2 obj is :" + f2.hashCode());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hashcode for fruts2 obj is :" + f2.hashCode());
		System.out.println("Hashcode for fruts1 obj is :" + f1.hashCode());
		System.out.println("Equality of F1 and F2 objects is :" + f1.equals(f2));

		HashSet<Fruits> hs = new HashSet<Fruits>();
		hs.add(f1);
		hs.add(f2);
		System.out.println(hs.size());

		System.out.println(f1 == f2); // This will never be equal, even you
										// override equals and hashcode
	}

}
