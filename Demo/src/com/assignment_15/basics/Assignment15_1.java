package com.assignment_15.basics;

import java.util.Scanner;

/*1.
1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
1.2 Design the below method into Policy class and which return the policy object
public Policy getPolicyDetails() 
1.3 Input should be taken from user and print that data into getPolicyDetails () method
*/

class Policy{
	private int policyId;
	private String policyName;
	private String policyType;
	private double premiumAmount;
	
	public Policy(int policyId, String policyName, String policyType, double premiumAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.premiumAmount = premiumAmount;
	}

	public int getPolicyId() {
		return policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}
	public static Policy getPolicyDetails() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter Policy ID:  ");
		int policyId = sc.nextInt();
		sc.nextLine();// for newline
		
        System.out.print("Enter Policy Name: ");
        String policyName = sc.nextLine();

        System.out.print("Enter Policy Type: ");
        String policyType = sc.nextLine();

        System.out.print("Enter Premium Amount: ");
        double premiumAmount = sc.nextDouble();

        return new Policy(policyId, policyName, policyType, premiumAmount);
    }
	 // Method to print policy details
    public void printPolicyDetails() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Name: " + policyName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Premium Amount: " + premiumAmount);
    }
}
				
	
public class Assignment15_1 {
	public static void main(String[] args) {
		
		Policy policy = Policy.getPolicyDetails();
        policy.printPolicyDetails();
	}

}
