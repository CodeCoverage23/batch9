package com.Assignment8;

public class Student {

private String firstName;
private String lastName;
private String city;
private String mobileNumber;
private String country = "India";
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
public Student() {
	super();
}




}
