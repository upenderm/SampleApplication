package com.test.samples;

public class GarbageCollectionDemo {

   public static void main(String[] args) {
      System.out.println("Hello World");
      /*
       * Do some other operations as needed
       */
      System.gc();
      System.out.println("Cleaning completed...");

   }

}
