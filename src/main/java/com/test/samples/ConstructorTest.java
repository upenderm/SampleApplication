package com.test.samples;

public class ConstructorTest {
   
   public ConstructorTest(){
      this(5);
      System.out.println("In zero cons.");
   }
   public ConstructorTest(int x){
      this(5,7);
      System.out.println("In single argument");
   }
   public ConstructorTest(int x, int y){
      System.out.println("In dual arugment const.");
   }
   public static void main(String[] args) {
      ConstructorTest ct = new ConstructorTest();
   }

}
class A{
   A(int x, int y){
      System.out.println("In super class dual const.");
   }
}
class B extends A{
   B(){
      super(5,7);
   }
   public static void main(String[] args) {
      B b = new B();
   }
}
