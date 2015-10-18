package com.temporary;

public class Employee implements Cloneable {

   private Integer empId;
   private String empName;
   private Address address;

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

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }
   
   @Override
   public Employee clone(){
      try {
         return (Employee)super.clone();
      }
      catch (CloneNotSupportedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }

}
