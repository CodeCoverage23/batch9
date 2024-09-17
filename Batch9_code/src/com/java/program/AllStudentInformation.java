package com.java.program;

import java.util.Scanner;

public class AllStudentInformation {

	public void getUserInput() {
		
		Student student= new Student();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the first name>>");
		student.setFirstName(sc.nextLine());
		System.out.println("Enter the last name>>");
		student.setLastName(sc.nextLine());
		System.out.println("enter the City");
		student.setCity(sc.nextLine());
		System.out.println("enter the mobile number>>");
		student.setMobileNummber(sc.nextLine());
		
		student.setCountry("india");
		
		getStudentInformation(student.getFirstName(), student.getLastName(), student.getCity(), student.getMobileNummber(), student.getCountry());
		
		
	}
		
		
		
		public void getStudentInformation(String fname , String lastname, String city,String mobileno, String country) {
			
			
			System.out.println("student informaion>>");
			System.out.println("first name: "+fname);
			System.out.println("last name: "+lastname);		
			System.out.println("city: "+city);
			System.out.println("mobile number: "+mobileno);
			System.out.println("country: "+country);
			System.out.println();
	
		}
		
	public static void main(String[] args) {
		
		AllStudentInformation studentInfo= new AllStudentInformation();
		
		System.out.println("Enter the number of student to be show>>");
		
		Scanner sc =new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=1 ; i<=count;i++) {
			System.out.println("enter the student details>>");
			studentInfo.getUserInput();
		}
	
		System.out.println("<<<<<<<all student informations are printed>>>>>>>>");
		
	}

}
