package com.assignment_9.com;


/*Write the Java program in which create the multiple objects
 *  and display the count of number of
 *objects created into class.
 *
 */

class Student{
	private String firstName;
	private String lastName;
	private String city;
	private String country;
	private String mobileNumber;
	
	private static int objectCount = 0; //Static variable to keep track of object count
	
	//constructor
	public Student(String firstName, String lastName, String city, String country, String mobileNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.country = country;
		this.mobileNumber = mobileNumber;
		
		objectCount++;
	}
	//Getter for object count
	public static int getobjectCount() {
		return objectCount;
	}
	
	@Override
	public String toString() {
		return ("Student FirstName= " + firstName + ", LastName= " +lastName + ", City= " + city + ", Country= " + country + ", MobileNumber= " + mobileNumber) ;
		
	}
	
}

public class Assignment9_1 {

	public static void main(String[] args) {
	
		//Creating multiple student objects
		
	Student stud1 =	new Student("Pallavi", "Ghodake", "Pune", "India", "1234567890");
    Student stud2 = new Student("Ishaan", "Raut", "Pune", "India", "0987654321");
    Student stud3 = new Student("Ali", "Roy", "Delhi", "India", "1122334455");

        // Displaying the count of objects created
        System.out.println("Total number of Student objects created: " + Student.getobjectCount());
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
		
	}

}
