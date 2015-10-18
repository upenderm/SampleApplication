package com.test.samples;

import java.util.HashMap;
import java.util.Map;

public class Test {

   public static void main(String[] args) {
      Map<Integer, String> mp = new HashMap<Integer, String>();
      mp.put(1, "Rammu");
      mp.put(3993, "Gajini");
      for (Map.Entry<Integer, String> dd : mp.entrySet()) {
         System.out.print(dd.getKey() + ", ");
         System.out.println(dd.getValue());
      }

      
      System.out.println(EnumTest.valueOf(1));
   }
}
