package com.test.samples;

public class EllipsisTest {

   public static void main(String[] args) {
      EllipsisTest et = new EllipsisTest();
      et.displayEmployeeDetails("Ramu", "Gopi");

   }
   
   public void displayEmployeeDetails(String... empName){
      String[] empNames = empName;
      for(int i=0;i<empNames.length;i++){
         System.out.println(empNames[i]);
      }
      for(String str: empNames){
         System.out.println("name is :"+str);
      }
      System.out.println("emp name is :"+empName);
   }
   
   

}
