package com.test.samples;
public class StaticNonStaticTest {
   String empName = "Ramu";
   static String empAddress = "Hyderabad";
   
   public static void main(String[] args) {
      System.out.println(empAddress);
      StaticNonStaticTest sc = new StaticNonStaticTest();
      sc.display();
      
   }
   public void display(){
      System.out.println(empName);
   }
}
