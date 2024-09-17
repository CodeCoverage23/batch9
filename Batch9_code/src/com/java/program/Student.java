package com.java.program;

public class Student {

private String firstName;

private String lastName;

private String city;

private String country;

private String mobileNummber;

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

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getMobileNummber() {
	return mobileNummber;
}

public void setMobileNummber(String mobileNummber) {
	this.mobileNummber = mobileNummber;
}

public Student() {
	super();
	
}

public Student(String firstName, String lastName, String city, String country, String mobileNummber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.country = country;
	this.mobileNummber = mobileNummber;
}

		


		
	}


