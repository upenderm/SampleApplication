package com.test.samples;

import java.util.ArrayList;
import java.util.HashMap;

import com.test.samples.model.ImmutableObject;

public class MakeAnObjectImmutableTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		hmap.put(5, "Five");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		ImmutableObject imo = new ImmutableObject(5, "World", hmap, list);
		System.out.println(imo.getKey());
		System.out.println(imo.getValue());
		System.out.println(imo.getObjectRefsMap());
		System.out.println(imo.getMyList());
		imo.getObjectRefsMap().put(6, "Six");
		imo.getMyList().add("Threes");
		System.out.println(imo.getObjectRefsMap());
		System.out.println(imo.getMyList());
	}

}
