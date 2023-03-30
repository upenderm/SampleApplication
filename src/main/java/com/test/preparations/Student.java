package com.test.preparations;

public class Student implements Comparable<Student> {

	private Integer studentAge;
	private String studentName;

	public Student(Integer studentAge, String studentName) {
		super();
		this.studentAge = studentAge;
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentAge=");
		builder.append(studentAge);
		builder.append(", studentName=");
		builder.append(studentName);
		builder.append("]\n");
		return builder.toString();
	}

	@Override
	public int compareTo(Student o) {
		return (o.getStudentAge() == this.getStudentAge() ? 0 : o.getStudentAge() > this.getStudentAge() ? 1 : -1);
	}

}
