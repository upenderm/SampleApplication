package com.test.samples.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import com.test.samples.model.Employee;
import com.test.samples.model.EmployeeV2;

public class SortingTestV2 {

   public static void main(String[] args) {
      List<EmployeeV2> list = new ArrayList<EmployeeV2>();
      list.add(new EmployeeV2(15, "Delhi"));
      list.add(new EmployeeV2(61, "Mumbai"));
      list.add(new EmployeeV2(17, "Calcutta"));
      list.add(new EmployeeV2(18, "Chennai"));
      list.add(new EmployeeV2(9, "Hyderabad"));
      list.add(new EmployeeV2(35, "Bangalore"));

      for (EmployeeV2 str : list) {
         System.out.println(str.getEmpName());
      }

      Collections.sort(list, new EmployeeV2());
      System.out.println("-------------List sorted---------------");

      for (EmployeeV2 str : list) {
         System.out.println(str.getEmpName());
      }

   }

}
