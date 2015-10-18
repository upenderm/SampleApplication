package com.test.samples.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Exception Handling can be done in two ways... 1. Throws declaration and 2. Try-Catch Handling.
 this program has been written after attending Ness Interview.
 In test() instead of handling exception i'm simply declaring with throws and in the main method handling the error.
 Also a Try block can exist without catch block, then you need to add finally block.
 */
public class ExceptionTest2 {

   public static void main(String[] args) {
      ExceptionTest2 et = new ExceptionTest2();
      try {
         et.test();
      }
      catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   private void test() throws FileNotFoundException {
      FileInputStream fis = new FileInputStream("");

   }

}
