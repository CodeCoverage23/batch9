package com.Assignment24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Suppose I have Employee class that containing I'd, name and city now I want to sort the 
//data based on comparable interface by using name.


public class Employee implements Comparable<Employee>{
	int id;
	String name;
    String city;
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}


	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		List<Employee> empl=new ArrayList<>();
		empl.add(new Employee(101,"Jiya","Amt"));
		empl.add(new Employee(143,"Sam","Yvt"));
		empl.add(new Employee(132,"Ron","Akola"));
		empl.add(new Employee(99,"abhi","Nagpur"));
		
	//	Collections.sort(empl, Comparator<Employee>);
		System.out.println("Employees sorted by name : ");
		for(Employee emp : empl) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			
		}

	}


	

}
