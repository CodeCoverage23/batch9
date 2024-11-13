package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Employee.Employee;

class Test2 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
}

//class Test3 implements Comparable<Employee>{
//
//	@Override
//	public int compareTo(Employee o) {
//		
//		return o.getName().compareTo(o.getName());
//	}
//	
//}

public class SortBySalary {
 
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100,"jiya",90000));
		empList.add(new Employee(109,"abhi",75000));
		empList.add(new Employee(106,"candy",32000));
		empList.add(new Employee(104,"sarah",54000));
		empList.add(new Employee(110,"Ruby",65000));
		
		empList.forEach(System.out :: println);
		System.out.println("***********");
		Collections.sort(empList,new Test2());
		
		empList.forEach(System.out ::println);
	}
}
