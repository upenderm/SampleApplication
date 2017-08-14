package com.test.samples.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplsTest {

	public static void main(String[] args) {
		System.out.println("Hello......This test is using Set and HashSet");
		Set st = new HashSet();
		st.add(new Integer(5));
		st.add(new Integer(6));
		st.add(new Integer(7));
		st.add(new Integer(5));
		st.add(new Integer(1));
		st.add(new Integer(4));
		st.add(new Integer(3));
		st.add(new Integer(2));

		Iterator it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Hello......This test is using Set and LinkedHashSet");
		Set st5 = new LinkedHashSet();
		st5.add(new Integer(5));
		st5.add(new Integer(6));
		st5.add(new Integer(7));
		st5.add(new Integer(5));
		st5.add(new Integer(1));
		st5.add(new Integer(4));
		st5.add(new Integer(3));
		st5.add(new Integer(2));

		Iterator it5 = st5.iterator();
		while (it5.hasNext()) {
			System.out.println(it5.next());
		}

		Set st2 = new HashSet();
		Dummy d1 = new Dummy(5, "Ramu");
		Dummy d2 = new Dummy(6, "Somu");
		Dummy d3 = new Dummy(7, "Bheemu");
		st2.add(d1);
		st2.add(d2);
		st2.add(d3);
		st2.add(d1);

		Iterator it2 = st2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("Hello......This test is using Set and TreeSet");
		Set st3 = new TreeSet();
		st3.add(new Integer(5));
		st3.add(new Integer(6));
		st3.add(new Integer(7));
		st3.add(new Integer(5));
		st3.add(new Integer(1));
		st3.add(new Integer(4));
		st3.add(new Integer(3));
		st3.add(new Integer(2));

		Iterator it3 = st3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		Set st4 = new TreeSet();
		Dummy d4 = new Dummy(51, "Ramu");
		Dummy d5 = new Dummy(61, "Somu");
		Dummy d6 = new Dummy(71, "Bheemu");
//		st4.add(d4);
		st4.add(d5);
		st4.add(d6);
		st4.add(d4);

		Iterator it4 = st4.iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());
		}
	}

}
