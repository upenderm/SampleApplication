package com.test.preparations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmployeeTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(210, "EmployeeAOne", "Technical", 2000));
		empList.add(new Employee(658, "EmployeeKTen", "Technical", 8000));
		empList.add(new Employee(124, "EmployeeINine", "Accounts", 2135));
		empList.add(new Employee(657, "EmployeeBTwo", "Administration", 3000));
		empList.add(new Employee(321, "EmployeeHEight", "Technical", 4500));
		empList.add(new Employee(346, "EmployeeCThree", "Account", 6000));
		empList.add(new Employee(111, "EmployeeEFive", "Accounts", 4300));
		empList.add(new Employee(659, "EmployeeGSeven", "Administration", 1000));
		empList.add(new Employee(888, "EmployeeFSix", "Accounts", 5100));
		empList.add(new Employee(574, "EmployeeDFour", "Administration", 500));

		empList.forEach(System.out::println);
		Collections.sort(empList);
		System.out.println("with Comparable ......................");
		empList.forEach(System.out::println);

		Collections.sort(empList, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (e1.getEmployeeName().compareTo(e2.getEmployeeName()));
			}
		});
		System.out.println("with Regular Comparator ......................");
		empList.forEach(System.out::println);
		System.out.println("with Java 8 Comparator ......................");
		empList.stream().sorted((a, b) -> a.getDepartment().compareTo(b.getDepartment())).forEach(System.out::println);
		
		System.out.println(empList.stream().findFirst().get());
		
		System.out.println(empList.stream().sorted((a,b) -> a.getSalary().compareTo(b.getSalary())).findFirst());
		
		System.out.println(empList.stream().sorted((a , b) -> Integer.compare(b.getSalary(), a.getSalary())).findFirst());
		
		System.out.println(empList.stream().max((a , b) -> Integer.compare(a.getSalary(), b.getSalary())));
		
		
		
	}

}
