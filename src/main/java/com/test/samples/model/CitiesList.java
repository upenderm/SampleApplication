package com.test.samples.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CitiesList {
   
   public List<String> getCitysList(){
      List<String> list = new ArrayList<String>();
      list.add("Hyderabad");
      list.add("Delhi");
      list.add("Mumbai");
      list.add("Calcutta");
      list.add("Bangalore");
      list.add("Chennai");
      list.add("Warangal");
      list.add("Karimnagar");
      list.add("Trivendrum");
      return list;
   }

   public Vector<String> getFruitsInaVector(){
      Vector<String> vct = new Vector<String>();
      vct.add("Apple");
      vct.add("Banana");
      vct.add("PineApple");
      vct.add("Watermelon");
      vct.add("promogranate");
      vct.add("Papaya");
      vct.add("Muskmelon");
      vct.add("Grapes");
      vct.add("Cherry");
      return vct;
   }

	private String testMethodAndNotUsingAnyWhere() {
		System.out.println("Hello World ... I'm a private method. Please don't access me...");
		return "Hello World";
	}

}
