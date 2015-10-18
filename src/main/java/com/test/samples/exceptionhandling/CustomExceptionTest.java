package com.test.samples.exceptionhandling;

import java.io.DataInputStream;
import java.io.IOException;

public class CustomExceptionTest {

   public static void main(String[] args) {
      System.out.println("Welcome to Metro movies.");
      System.out.println("Please enter your age :");
      try {
         String str = new DataInputStream(System.in).readLine();
         if (Integer.parseInt(str) > 70) {
            throw new InvalidAgeException();
         }else if (Integer.parseInt(str)>20){
            System.out.println("So how are you feeeling to watch our movies");
         }
         else {
            throw new InSufficientAgeException();
         }
      }
      catch (IOException e) {
         System.out.println(e);
      }
      catch (InSufficientAgeException e) {
         e.printStackTrace();
      }
      catch (InvalidAgeException e) {
         e.printStackTrace();
      }

   }

}
