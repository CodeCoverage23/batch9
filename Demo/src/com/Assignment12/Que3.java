package com.Assignment12;

import java.util.Scanner;
/*
 * Insurance
Int: id
String: personName
String: insuranceCompany
Void: getInsuranceDetails()
Void:
getInsuranceInformation()
 * 
 * 
 * LifeInsurance
Int: premiumAmount
Void: getLifeInsuranceDetails()

Void:

getLifeInsuranceInformation()
 * 
 * 
 * TermPolicy
Int: duration
Void: getTermPolicyDetails()
Void:
getTermPolicyInformation()
 * 

 * 
 */
class Insurance {
	
	int id;
	String personName;
	String insuranceCompany;
	void getInsuranceDetails(Scanner sc) {
		System.out.println("Enter id : ");
		id=sc.nextInt();
		System.out.println("Enter the Person name : ");
		personName=sc.next();
		System.out.println("Enter the insuranceCompany : ");
		insuranceCompany=sc.next();
		
	}
	void getInsuranceInformation() {
		System.out.println("*********************************************************");
		System.out.println("Insurance Details -->>");
		System.out.println("Id : "+id);
		System.out.println("Person Name : "+personName);
		System.out.println("Insurance Company  : "+insuranceCompany);
	}
}


class LifeInsurance  extends Insurance{
	int premiumAmount;
	void getLifeInsuranceDetails(Scanner sc) {
		getInsuranceDetails(sc);
		System.out.println("Enter Premium Amount : ");
		premiumAmount=sc.nextInt();
		
	}

	void getLifeInsuranceInformation() {
		getInsuranceInformation();
		System.out.println("Premium Amount : "+premiumAmount);
	}
}


class TermPolicy extends LifeInsurance{
	int duration;
	void getTermPolicyDetails(Scanner sc) {
		getLifeInsuranceDetails(sc);
		System.out.println("Enter duration : ");
		duration=sc.nextInt();
		
	}

	void getTermPolicyInformation() {
		getLifeInsuranceInformation();
		System.out.println("duration : "+duration);
	}
	
}


public class Que3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TermPolicy t = new TermPolicy();
		t.getTermPolicyDetails(sc);
		t.getTermPolicyInformation();
	}
	
}
