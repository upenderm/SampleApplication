package com.test.preparations2;

public class Employee {

	private Integer empId;
	private String empName;
	private String department;
	private Integer salary;

	public final Integer getEmpId() {
		return empId;
	}

	public final void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Employee(Integer empId, String empName, String department, Integer salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}

	public final String getEmpName() {
		return empName;
	}

	public final void setEmpName(String empName) {
		this.empName = empName;
	}

	public final String getDepartment() {
		return department;
	}

	public final void setDepartment(String department) {
		this.department = department;
	}

	public final Integer getSalary() {
		return salary;
	}

	public final void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", department=");
		builder.append(department);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
