package com.test.preparations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTest {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Las Vegas");
		cities.add("San Diego");
		cities.add("Dallas");
		cities.add("New York");
		cities.add("Philly");
		cities.add("West Chester");
		cities.add("Exton");
		cities.add("Charlotte");
		cities.add("Durham");
		
		List<Student> studentsList = new ArrayList<>();
		List<Student> studentsList2 = new ArrayList<>();
		studentsList.add(new Student(10, "Student 1"));
		studentsList.add(new Student(1, "Student 2"));
		studentsList.add(new Student(9, "Student 3"));
		studentsList.add(new Student(4, "Student 4"));
		studentsList.add(new Student(5, "Student 5"));
		studentsList.add(new Student(7, "Student 6"));
		studentsList.add(new Student(2, "Student 7"));
		studentsList.add(new Student(3, "Student 8"));
		studentsList2.addAll(studentsList);
		System.out.println(studentsList);
		
		Collections.sort(studentsList);
		System.out.println("After sorting WITH AGE");
		System.out.println(studentsList);
		Collections.sort(studentsList, new Comparator<Student>() {
			public int compare(Student st1, Student st2) {
				return st1.getStudentName().compareTo(st2.getStudentName());
			}
		});
		System.out.println("After sorting WITH NAME");
		System.out.println(studentsList);
		
		System.out.println("Sorting using Java 8");
		
		studentsList2.sort((st1, st2) -> st1.compareTo(st2));
		System.out.println(studentsList2);
		
		System.out.println("Before sorting -----------------");
		cities.forEach(city -> System.out.println(city));
		cities.sort((c1, c2) -> c1.compareTo(c2)); 
		System.out.println("After sorting ------------------");
		cities.forEach(city -> System.out.println(city));
		
		List<Boolean> collect = studentsList.stream().map(st -> st.getStudentAge()>8).collect(Collectors.toList());
		System.out.println(collect);
	}

}
