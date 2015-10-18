package com.test.samples;

import java.io.IOException;

public class CloneableTest {

   public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
      CloneableObject co = new CloneableObject();
      co.setEmpId(5);
      co.setEmpName("Ramu");
      
      CloneableObject co2 = new CloneableObject();
      co2.setEmpId(5);
      co2.setEmpName("Ramu");

      System.out.println("Equality with hashcode is :"+co.equals(co2));
//      Actual cloning part starts from here.
      System.out.println("**********   Shallo copy starts here  ***********");

      CloneableSubObject cso = new CloneableSubObject();
      cso.setEmpAddress("Hyderabad");
      co.setEmpId(5);
      co.setEmpName("Ramu");
      co.setCso(cso);
      
      CloneableObject co3 = (CloneableObject) co.clone();
      System.out.println(co.equals(co3));
      System.out.println(co3.getEmpName());
      System.out.println(co3.getEmpId());
      System.out.println(co3.getCso().getEmpAddress());
      
      CloneableSubObject cso2 = new CloneableSubObject();
      cso.setEmpAddress("Secunderabad");
      co.setCso(cso2);
      
      System.out.println(co.equals(co3));
      System.out.println(co3.getEmpName());
      System.out.println(co3.getEmpId());
      System.out.println(co3.getCso().getEmpAddress());
      
      System.out.println("**********   Deep copy starts here  ***********");
      CloneableObject co4 = (CloneableObject)co.deepClone();
      System.out.println(co4);
      System.out.println(co4.getEmpName());
      System.out.println(co4.getEmpId());
      System.out.println(co4.getCso().getEmpAddress());
   }

}
