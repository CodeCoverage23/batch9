package com.Assignment20;

import java.util.ArrayList;

//Design the method for ArrayList<Employee> which returns the list of employee and print that data.

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
				
	}
	
}

public class Que3 {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(101,"Jon",70000));
		al.add(new Employee(102,"Ron",80000));
		al.add(new Employee(103,"Riya",40000));
		al.add(new Employee(104,"Jiya",90000));
		al.add(new Employee(105,"Piya",50000));
		
		for(Employee e : al) {
			System.out.println("Employee Details -->>>");
			System.out.println("Id : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("Salary : "+e.salary);
			
			System.out.println();
		}

	}

}
