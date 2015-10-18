package com.test.samples.util;

import java.util.Enumeration;
import java.util.Vector;

import com.test.samples.model.CitiesList;


public class EnumerationTest {

   public static void main(String[] args) {
      CitiesList model = new CitiesList();
      Vector<String> vt = model.getFruitsInaVector();
      Enumeration<String> enmr = vt.elements();
      while (enmr.hasMoreElements()) {
         String str = (String) enmr.nextElement();
         System.out.println(str);
      }
   }

}
