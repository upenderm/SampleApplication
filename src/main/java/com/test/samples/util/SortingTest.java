package com.test.samples.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.samples.model.CitiesList;
import com.test.samples.model.Employee;

public class SortingTest {

   public static void main(String[] args) {
      CitiesList clist = new CitiesList();
      List<String> list = clist.getCitysList();
      System.out.println("******  City's list before sorting");
      for (String str : list) {
         System.out.println(str);
      }
      System.out.println("******  City's list after sorting");
      Collections.sort(list);
      for (String str : list) {
         System.out.println(str);
      }
      System.out.println("####################################################");
      List<Employee> empList = new ArrayList<Employee>();
      empList.add(new Employee(20, "Mahesh", "Hyderabad"));
      empList.add(new Employee(12, "Suresh", "Mangapet"));
      empList.add(new Employee(28, "Balaiah", "Balanagar"));
      empList.add(new Employee(31, "Zubeda", "Parsigutta"));
      System.out.println("****** Employee's list before sorting");
      for (Employee emp : empList) {
         System.out.println(emp.getEmpName());
      }
      System.out.println("****** Employee's list after sorting");
      Collections.sort(empList);
      for (Employee emp : empList) {
         System.out.println(emp.getEmpName());
      }
      System.out.println("####################################################");
      Collections.sort(empList, new Comparator<Employee>() {
         public int compare(Employee emp1, Employee emp2) {
            return emp1.getEmpName().compareTo(emp2.getEmpName());
         }
      });
      for (Employee emp : empList) {
         System.out.println(emp.getEmpName());
      }
   }

}
