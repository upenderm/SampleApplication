package com.test.samples.util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementationsTest {

	public static void main(String[] args) {
		Map<Integer,String> map = null;
		Iterator iter = null;
		System.out.println("This is a HashMap order test");
		map = new HashMap<>();
		map.put(7, "Delhi");
		map.put(9, "Mumbai");
		map.put(3, "Calcutta");
		map.put(4, "Chennai");
		map.put(1, "Bangalore");
		map.put(6, "Hyderabad");
		map.put(5, "Noida");
		map.put(8, "Pune");
		map.put(2, "Gurgaon");
		map.put(10, "Trivandrum");
		iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("--------------------------------------------------");
		System.out.println("This is a LinkedHashMap order test");
		map = new LinkedHashMap<>();
		map.put(7, "Delhi");
		map.put(9, "Mumbai");
		map.put(3, "Calcutta");
		map.put(4, "Chennai");
		map.put(1, "Bangalore");
		map.put(6, "Hyderabad");
		map.put(5, "Noida");
		map.put(8, "Pune");
		map.put(2, "Gurgaon");
		map.put(10, "Trivandrum");
		iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("--------------------------------------------------");
		System.out.println("This is a TreeMap order test");
		map = new TreeMap<>();
		map.put(7, "Delhi");
		map.put(9, "Mumbai");
		map.put(3, "Calcutta");
		map.put(4, "Chennai");
		map.put(1, "Bangalore");
		map.put(6, "Hyderabad");
		map.put(5, "Noida");
		map.put(8, "Pune");
		map.put(2, "Gurgaon");
		map.put(10, "Trivandrum");
		iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("--------------------------------------------------");
		System.out.println("This is a HashTable order test");
		map = new Hashtable<>();
		map.put(7, "Delhi");
		map.put(9, "Mumbai");
		map.put(3, "Calcutta");
		map.put(4, "Chennai");
		map.put(1, "Bangalore");
		map.put(6, "Hyderabad");
		map.put(5, "Noida");
		map.put(8, "Pune");
		map.put(2, "Gurgaon");
		map.put(10, "Trivandrum");
		iter = map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
