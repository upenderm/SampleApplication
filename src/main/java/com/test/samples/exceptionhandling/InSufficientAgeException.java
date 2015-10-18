package com.test.samples.exceptionhandling;

public class InSufficientAgeException extends Exception{
   
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public String toString(){
      
      return "Your Age is not allowed for this event. Please eat complain and come after you grow.";
   }

}
