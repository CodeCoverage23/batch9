package com.Assignment8;

import java.util.Scanner;

public class StudentInformation {
public void getUserInput() {
		
		Student student= new Student();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the first name>>");
		student.setFirstName(sc.nextLine());
		System.out.println("Enter the last name>>");
		student.setLastName(sc.nextLine());
		System.out.println("Enter the City");
		student.setCity(sc.nextLine());
		System.out.println("Enter the mobile number>>");
		student.setMobileNumber(sc.nextLine());
		
		student.setCountry("India");
		
		getStudentInformation(student.getFirstName(), student.getLastName(), student.getCity(), student.getMobileNumber(), student.getCountry());
		
		
	}
    
    public void getStudentInformation(String fname , String lastname, String city,String mobileno, String country) {
	
	
	   System.out.println("student informaion : ");
	   System.out.println("first name: "+fname);
	   System.out.println("last name: "+lastname);		
	   System.out.println("city: "+city);
	   System.out.println("mobile number: "+mobileno);
	   System.out.println("country: "+country);
	   System.out.println();

    }

		

	public static void main(String[] args) {
        StudentInformation studentInfo= new StudentInformation();
		
		System.out.println("Enter the number of student : ");
		
		Scanner sc =new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=1 ; i<=count;i++) {
			System.out.println("Enter the student details : ");
			studentInfo.getUserInput();
		}
	
		System.out.println("***** All student informations are printed ******");
		



	}

}
