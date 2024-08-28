package com.asssignmet_3.basic;

public class Assignment3 {
	//Method to get student name
	public String getStudentName(String name) {

		//Print student name
		System.out.println("Student Name: "+name)
		//Return the student name
		return name;
	}

	public static void main(String[] args) {

		//Create an instance of student class

		Assignment3 student = new Assignment3();

		//Call the getStudentName method and store the result

		String studentName = student.getStudentName("Nisarg Meshram");

		System.out.println("Return student name: " + studentName);


	}
