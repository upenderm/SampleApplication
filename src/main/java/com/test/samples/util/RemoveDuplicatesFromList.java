package com.test.samples.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

   public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      list.add("Delhi");
      list.add("Hyderabad");
      list.add("Delhi");

      Set<String> s = new HashSet<String>(list);
      Iterator<String> iter = s.iterator();
      while (iter.hasNext()) {
         System.out.println(iter.next());
      }
      System.out.println("----------------------");
      List<String> list2 = new ArrayList<String>(s);
      for (String str : list2) {
         System.out.println(str);
      }
   }

}
