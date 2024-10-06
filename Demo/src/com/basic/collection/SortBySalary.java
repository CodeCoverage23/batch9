package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test2 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary() - o1.getSalary());
	}

	/*
	 * Provides sorting order by Id
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { return (o2.getId() -
	 * o1.getId()); }
	 * 
	 * Provides sorting order by name
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { return
	 * o2.getName().compareTo(o1.getName()); }
	 */
}

/*
 * class Test3 implements Comparable<Employee> {
 * 
 * @Override public int compareTo(Employee o) { return
 * o.getName().compareTo(o.getName()); }
 * 
 * }
 */

public class SortBySalary {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Pavan", 52000.50D));
		empList.add(new Employee(109, "Kishor", 25000.90D));
		empList.add(new Employee(108, "Shiva", 55000));
		empList.add(new Employee(104, "Akshay", 57500));
		empList.add(new Employee(102, "Nisarg", 85000.50));

		empList.forEach(System.out::println);

		System.out.println("**************************");

		Collections.sort(empList, new Test2());

		empList.forEach(System.out::println);
	}

}