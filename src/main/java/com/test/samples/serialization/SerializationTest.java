package com.test.samples.serialization;

import java.io.Serializable;

public class SerializationTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer employeeID;
	private String employeeName;
	private transient String empSalary;
	
	public String getEmpSalary() {
      return empSalary;
   }
   public void setEmpSalary(String empSalary) {
      this.empSalary = empSalary;
   }
   public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
