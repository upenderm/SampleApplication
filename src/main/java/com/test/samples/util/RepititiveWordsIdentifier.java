package com.test.samples.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepititiveWordsIdentifier {

   public void identifyRepititiveWords(String str) {
      System.out.println("In identifyRepititiveWords() of RepititiveWordsIdentifier");
      String delimiter="[\\s,.]";
      List<String> list = Arrays.asList(str.split(delimiter));
      Set<String> strSet = new HashSet<String>(list);
      for (String str2 : strSet) {
         System.out.println(str2 + " : " + Collections.frequency(list, str2));
      }
   }

   public static void main(String[] args) {
      String str = "I Love my India I love my Telangana, I love. Hyderabd and love Warangal";
      RepititiveWordsIdentifier identifier = new RepititiveWordsIdentifier();
      identifier.identifyRepititiveWords(str);
   }

}
