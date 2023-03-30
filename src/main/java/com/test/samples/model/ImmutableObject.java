package com.test.samples.model;

import java.util.ArrayList;
import java.util.HashMap;

public final class ImmutableObject {

	private final Integer key;
	private final String value;
	private final HashMap<Integer, String> objectRefsMap;
	private final ArrayList<String> myList;

	public ImmutableObject(Integer key, String value, HashMap<Integer, String> objectRefsMap,
			ArrayList<String> myList) {
		// Here implement Object Deep cloning.
		this.key = key;
		this.value = value;
		HashMap<Integer, String> map = new HashMap<>();
		objectRefsMap.entrySet().stream().forEach(a -> {
			map.put(a.getKey(), a.getValue());
		});
		this.objectRefsMap = map;
		ArrayList<String> myList2 = new ArrayList<>();
		myList2.addAll(myList);
		this.myList = myList2;
	}

	public final Integer getKey() {
		return key;
	}

	public final String getValue() {
		return value;
	}

	public final HashMap<Integer, String> getObjectRefsMap() {
		return (HashMap<Integer, String>) objectRefsMap.clone();
	}

	public final ArrayList<String> getMyList() {
		ArrayList<String> copyList = new ArrayList<>(this.myList);
		return copyList;
	}

}
