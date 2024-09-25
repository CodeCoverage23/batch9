package com.assignment12.basics;

import java.util.Scanner;

/*Insurance
Int: id
String: personName
String: insuranceCompany
Void: getInsuranceDetails()
Void:
getInsuranceInformation()

LifeInsurance
Int: premiumAmount
Void: getLifeInsuranceDetails()

Void:

getLifeInsuranceInformation()

TermPolicy
Int: duration
Void: getTermPolicyDetails()
Void:
getTermPolicyInformation()
*/
 
class Insurance {
    int id;
    String personName;
    String insuranceCompany;

    void getInsuranceDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Insurance ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter Person Name: ");
        personName = sc.nextLine();
        System.out.println("Enter Insurance Company: ");
        insuranceCompany = sc.nextLine();
       
    }
    
    void getInsuranceInformation() {
        System.out.println("Insurance ID: " + id);
        System.out.println("Person Name: " + personName);
        System.out.println("Insurance Company: " + insuranceCompany);
    }
}

class LifeInsurance extends Insurance {
    int premiumAmount;

    void getLifeInsuranceDetails() {
        getInsuranceDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Premium Amount: ");
        premiumAmount = sc.nextInt();
       
    }
    
    void getLifeInsuranceInformation() {
        getInsuranceInformation();
        System.out.println("Premium Amount: " + premiumAmount);
    }
}

class TermPolicy extends LifeInsurance {
    int duration;

    void getTermPolicyDetails() {
        getLifeInsuranceDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Duration (in years): ");
        duration = sc.nextInt();
       
    }

    void getTermPolicyInformation() {
        getLifeInsuranceInformation();
        System.out.println("Duration: " + duration + " years");
    }
}

 public class Assignment12_3 {

	public static void main(String[] args) {
		 TermPolicy termPolicy = new TermPolicy();
	        termPolicy.getTermPolicyDetails();
	        System.out.println("\nTerm Policy Information:");
	        termPolicy.getTermPolicyInformation();
	}
		  

}
