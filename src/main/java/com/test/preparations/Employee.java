package com.test.preparations;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private Integer employeeId;
	private String employeeName;
	private String department;
	private Integer salary;

	public Employee(Integer employeeId, String employeeName, String department, Integer salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	public final Integer getEmployeeId() {
		return employeeId;
	}

	public final void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public final String getEmployeeName() {
		return employeeName;
	}

	public final void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public int compareTo(Employee e) {
		return (this.getEmployeeId() == e.getEmployeeId() ? 0 : (this.getEmployeeId() > e.getEmployeeId() ? 1 : -1));
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, employeeId, employeeName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(employeeName, other.employeeName) && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [employeeId=");
		builder.append(employeeId);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", department=");
		builder.append(department);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
