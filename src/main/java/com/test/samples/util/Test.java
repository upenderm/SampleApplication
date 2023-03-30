package com.test.samples.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

   public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1,3,5,7,9,11);
      List<Integer> list2 = new ArrayList<>();
      System.out.println(list.get(3));
      
      list2.addAll(list);
      list2.add(3, 25);
      System.out.println(list2);
      
      for(int i=0;i<list2.size();i++) {
    	  System.out.println(list2.get(i));
    	  
    	  list2.add(12);  // Fails in runtime b/c of ConcurrentModification --> fail fast
      }
      Iterator<Integer> iterator = list2.iterator();
      while(iterator.hasNext()) {
    	  System.out.println(iterator.next());
    	  
//    	  list2.add(12);  // Fails in runtime b/c of ConcurrentModification --> fail fast
      }
      System.out.println("---------------");
      for(int i =0;i<list.size();i++) {
    	  list.set(i, list.get(i) * list.get(i) );
    	  System.out.println(list);
      }
      
   }

}
