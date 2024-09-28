package com.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeInfo {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee(100,"jiya",90000));
		l.add(new Employee(101,"abhi",95000));
		l.add(new Employee(102,"akshay",80000));
		l.add(new Employee(103,"jeet",70000));
		
		Iterator<Employee> itr = l.iterator();
		while(itr.hasNext()) {
			Employee data=itr.next();
			System.out.println("Emloyee Information : ");
			System.out.println("Id : "+data.id);
			System.out.println("Name : "+data.name);
			System.out.println("Salary : "+data.salary);
			System.out.println("*********************************");
			System.out.println();
		}

	}

}
