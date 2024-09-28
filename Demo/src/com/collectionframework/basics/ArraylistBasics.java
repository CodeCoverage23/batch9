package com.collectionframework.basics;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int id;	
    private String name;
    private double salary;
 
 
public Employee(String name, double salary, int id) {
	super();
	this.name = name;
	this.salary = salary;
	this.id = id;
}
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public String employeeDetails() {
	return ("\n\nEmployee Id =>> " + id + " \n\nname =>> " + name + " \n\nsalary =>> ." + salary);
	
}


}
public class ArraylistBasics {
	
      public static void main(String[] args) {
    	  ArrayList<Employee> employee = new ArrayList<>();
		  Scanner sc = new Scanner(System.in);
		  
		  //get the no of employees to add
		  System.out.println("Enter the number of employees: ");
		  int numberOfEmployees = sc.nextInt();
		  
		  // Loop to get employee details from the user
	        for (int i = 0; i < numberOfEmployees; i++) {
	            System.out.println("Enter details for employee " + (i + 1) + ":");
	            System.out.print("ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("Salary: ");
	            double salary = sc.nextDouble();
	            
	            // Add the new Employee to the ArrayList
	            employee.add(new Employee(name, salary, id));
            }
	        
	        // Print the Employee objects
	        System.out.println("\nEmployee Details:");
	        for (Employee emp : employee) {
	            System.out.println(emp.employeeDetails());
	        }

	        sc.close();
				  

	}

}
