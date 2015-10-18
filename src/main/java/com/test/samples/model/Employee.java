package com.test.samples.model;

public class Employee implements Comparable<Employee> {

   private Integer empId;
   private String empName;
   private String address;

   public Employee(Integer empId, String empName, String empAddress) {
      this.empId = empId;
      this.empName = empName;
      this.address = empAddress;
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

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int compareTo(Employee e) {
      return ((this.empId > e.empId) ? 1 : (this.empId < e.empId) ? -1 : 0);
   }

}
