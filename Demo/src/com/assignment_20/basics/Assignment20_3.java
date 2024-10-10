package com.assignment_20.basics;

import java.util.ArrayList;
import java.util.List;

/* Design the method for ArrayList<Employee> which returns the list of employee 
 * and print that data.
 */
class Employee {
    private int id;
    private String name;
    private String department;
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return ("Employee id = "+ id + ", name = " + name + ", department = " +department);
	}
    
}

public class Assignment20_3 {

	public static void main(String[] args) {
		 List<Employee> emp = getEmployeeList();
	        
	        for (Employee employee : emp) {
	            System.out.println(employee);
	        }
	    }

	    public static List<Employee> getEmployeeList() {
	        List<Employee> emp = new ArrayList<>();
	        emp.add(new Employee(1, "RM", "HR"));
	        emp.add(new Employee(2, "Jungkook", "IT"));
	        emp.add(new Employee(3, "Taehyung", "Finance"));
	        emp.add(new Employee(4, "Suga", "Marketing"));
	        emp.add(new Employee(5, "Jimin", "Sales"));
	        emp.add(new Employee(6, "J-Hope", "Manager"));
	        emp.add(new Employee(7, "jin", "Exicutive Assistant"));
	        return emp;
	        
	}

}
