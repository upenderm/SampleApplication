package com.test.samples;

public class StringEqualityTest {

   public static void main(String[] args) {

      String str = new String("Hello World");
      String str4 = new String("Hello World");
      String str2 = "Hello World";
      String str3 = "Hello World";
      System.out.println(str == str2);
      System.out.println(str.equals(str2));
      System.out.println(str2 == str3);
      System.out.println(str == str4);
   }

}
