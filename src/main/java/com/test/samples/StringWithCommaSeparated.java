package com.test.samples;

import java.util.ArrayList;
import java.util.List;

public class StringWithCommaSeparated {

   public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      list.add("Hyderabad");
      list.add("Delhi");
      list.add("Mumbai");
      list.add("Chennai");
      list.add("Calcutta");
      list.add("Bangalore");
      list.add("Ahmedabad");
      list.add("Warangal");
      list.add("Karimnagar");
      int size = list.size();
      int counter = 1;
      for (int i = 0; i < size; i++) {
         if (i % 2 == 0) {
            System.out.print(list.get(i));
            if (counter < size) {
               System.out.print(", ");
            }
         }
         else {
            System.out.println(list.get(i));
         }
         counter++;
      }
   }}
