/**
 * 
 */
package com.test.samples.util;

import java.util.LinkedList;
import java.util.List;

/**
 * @author M Upender
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lList = new LinkedList<>();
		lList.add("Delhi");
		lList.add("Mumbai");
		lList.add("Kolkata");
		lList.add("Chennai");
		lList.add("Hyderabad");
		lList.add("Bangalore");		//	add method
		
		lList.remove("Bangalore");	// remove method
		
		for(String str : lList)
			System.out.println(str);
		
		System.out.println(lList.get(3));	// get method
		lList.set(7, "Warangal");			// set method
		lList.indexOf("Warangal");			

	}

}
