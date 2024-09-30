package com.Assignment15;

import java.util.Scanner;

/*
 * 1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
1.2 Design the below method into Policy class and which return the policy object
public Policy getPolicyDetails() 
1.3 Input should be taken from user and print that data into getPolicyDetails () method.

 */

class Policy{
	int policyId;
	String policyName,policyType;
	double premiumAmount;
	
	public Policy getPolicyDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Policy Details -->> ");
		System.out.println("Enter Policy Id : ");
		policyId=sc.nextInt();
		System.out.println("Enter the Policy Name : ");
		policyName=sc.next();
		System.out.println("Enter the Policy Type : ");
		policyType=sc.next();
		System.out.println("Enter the Premium Amount : ");
		premiumAmount=sc.nextDouble();
		return this;
		
	}
	
	public void DisplayPolicyDetails() {
		System.out.println("***********************************");
		System.out.println("Policy Details -->>");
		System.out.println("Policy id : "+policyId);
		System.out.println("Policy Name : "+policyName); 
		System.out.println("Policy Type : "+policyType);
		System.out.println("Premiun Amount : "+premiumAmount);
	}
}

public class Que1 {

	public static void main(String[] args) {
		Policy p=new Policy();
		p=p.getPolicyDetails();
		p.DisplayPolicyDetails();
	}

}
