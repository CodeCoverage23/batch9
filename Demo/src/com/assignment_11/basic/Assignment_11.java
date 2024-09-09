package com.assignment_11.basic;

/*I have student class now user restricts to create the object of that class from outside, write the code
 *for it.
 * 
 */

public class Assignment_11 {
	 private String name;
	    private int age;

	    // Private constructor
	    private Assignment_11(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Static method to create an instance of Student
	    public static Assignment_11 createStudent(String name, int age) {
	        return new Assignment_11(name, age);
	    }
	    // Getters for the fields
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
		
	}
}


