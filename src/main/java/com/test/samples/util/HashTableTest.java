package com.test.samples.util;

import java.util.Hashtable;

/**
 * @author MamindU
 *
 */
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(5, "Ramu");
	}
	
	private Integer empId;
	private String empName;
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
	
	public int hashCode(){
		
		return empId+empName.hashCode();
	}
	
	public boolean equals(Object o){
		if(o instanceof HashTableTest){
			HashTableTest t = (HashTableTest)o;
			return t.getEmpName().equals(this.empName);
		}
		return false;
	}

}
