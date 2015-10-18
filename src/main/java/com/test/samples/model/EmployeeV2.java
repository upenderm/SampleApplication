package com.test.samples.model;

import java.util.Comparator;

public class EmployeeV2 implements Comparator<EmployeeV2> {

   private Integer empId;
   private String empName;
   
   public EmployeeV2(Integer empId, String empName){
      this.empId = empId;
      this.empName = empName;
   }

   public EmployeeV2() {
      
   }

   public Integer getEmpId() {
      return empId;
   }

   public void setEmpId(Integer empId) {
      this.empId = empId;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public int compare(EmployeeV2 e1, EmployeeV2 e2) {
      return (e1.getEmpId() > e2.getEmpId()) ? 1 : (e1.getEmpId() < e2.getEmpId()) ? -1 : 0;
   }

}
