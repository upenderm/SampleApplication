package com.test.samples.exceptionhandling;

public class InvalidAgeException extends Exception {
   
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public InvalidAgeException(){
      super("Invalid Age Exception : Man... you are too old.. please take rest, its not for you...");
   }
   

}
