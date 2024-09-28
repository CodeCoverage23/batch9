package com.basic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}

public class ListOfEmployees {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Pavan", 52000));
		empList.add(new Employee(103, "Akshay", 20000));
		
		//Collectors.sort(empList);

		System.out.println(empList);
	}

}
