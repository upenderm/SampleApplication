package com.test.samples.util;

import java.util.HashMap;
import java.util.Map;

public class MapEntryTest {

	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashMap<>();
		fruitMap.put(1, "Apple");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Oranges");
		fruitMap.put(4, "Grapes");
		fruitMap.put(5, "Papaya");
		for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

}
