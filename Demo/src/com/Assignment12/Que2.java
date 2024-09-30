package com.Assignment12;

import java.util.Scanner;

/*
 * Bank
double : principleAmount
int: tenure
float: rateOfInterest
 * 
 * ICICIBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getICICIBankDetails()
 * 
 * SBIBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getSBIBankDetails()
 * 
 * HDFCBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getHDFCBankDetails()


 */


class Bank {

	double principleAmount;
	int tenure;
	float rateOfInterest;

}


class ICICIBank extends Bank{
	
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest) {
		double interest = (principleAmount*tenure*rateOfInterest)/100;
		
		return interest;
	}
		void getICICIBankDetails(Scanner sc){
			System.out.println("Enter Details below -->");
			System.out.println("Principle Amount : ");
			principleAmount=sc.nextDouble();
			System.out.println("tenure : ");
			tenure=sc.nextInt();
			System.out.println("Rate of Interest : ");
			rateOfInterest=sc.nextFloat();
			System.out.println("Interest -->> "+getCalculateInterest(principleAmount,tenure,rateOfInterest));
			
		}
	
}


class SBIBank extends Bank{
	
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest) {
		double interest = (principleAmount*tenure*rateOfInterest)/100;
		return interest;
	}
	void getSBIBankDetails(Scanner sc) {
		System.out.println("Enter Details below -->");
		System.out.println("Principle Amount : ");
		principleAmount=sc.nextDouble();
		System.out.println("tenure : ");
		tenure=sc.nextInt();
		System.out.println("Rate of Interest : ");
		rateOfInterest=sc.nextFloat();
		System.out.println("Interest -->> "+getCalculateInterest(principleAmount,tenure,rateOfInterest));
		
	}
	
}


class HDFCBank extends Bank{
	
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest) {
		double interest = (principleAmount*tenure*rateOfInterest)/100;
		return interest;
	}
	void getHDFCBankDetails(Scanner sc) {
		System.out.println("Enter Details below -->");
		System.out.println("Principle Amount : ");
		principleAmount=sc.nextDouble();
		System.out.println("tenure : ");
		tenure=sc.nextInt();
		System.out.println("Rate of Interest : ");
		rateOfInterest=sc.nextFloat();
		System.out.println("Interest -->> "+getCalculateInterest(principleAmount,tenure,rateOfInterest));
		
		
	}
	
}
public class Que2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Please Choose your Bank : ");
		System.out.println("1. ICICI");
		System.out.println("2. SBI");
		System.out.println("3. HDFC");
		
		int n=sc.nextInt();
		
		switch(n) {
		case 1 :
			ICICIBank i=new ICICIBank();
			i.getICICIBankDetails(sc);
			
			break;
			
		case 2 :
			SBIBank s=new SBIBank();
			s.getSBIBankDetails(sc);
			break;
			
		case 3 :
			HDFCBank h=new HDFCBank();
			h.getHDFCBankDetails(sc);
			break;
			
		default :
			System.out.println("Invalid Input");
			
		
		}
		
	    
		
	}
	
}
