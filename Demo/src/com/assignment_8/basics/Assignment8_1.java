package com.assignment_8.basics;



/*
 * Design the Student class which contain
   firstName, lastName, city and mobileNumber and  country.
*/

public class Assignment8_1 {
	
	
	    // Fields
	    private String firstName;
	    private String lastName;
	    private String city;
	    private String mobileNumber;
	    private String country;

	    // Constructor
	    public Assignment8_1(String firstName, String lastName, String city, String mobileNumber, String country) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.city = city;
	        this.mobileNumber = mobileNumber;
	        this.country = country;
	    }

	    // Getter and Setter methods
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Student Details:");
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("City: " + city);
	        System.out.println("Mobile Number: " + mobileNumber);
	        System.out.println("Country: " + country);
	    }
	    public static void main(String[] args) {
	    	
			Assignment8_1 assig = new Assignment8_1();
			
		}
	


	

	}


