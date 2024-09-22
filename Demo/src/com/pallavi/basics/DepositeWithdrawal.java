package com.pallavi.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepositeWithdrawal {

	static List<Integer> account = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		System.out.println("Wlcome to our bank application...!");
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(flag) {

			System.out.println("Enter 1 for Deposite");
			System.out.println("Enter 2 for Withdraw ");
			System.out.println("Enter 3 for Check balance");//TODO:Case  to check balance
			System.out.println("Enter 4 for Exit");
			int userChoice = sc.nextInt();
			
			switch(userChoice) {
            case 1:
                // deposit
                System.out.println("Enter the amount to deposit :");
                int depositAmount = sc.nextInt();

                if (!account.isEmpty()) {
                    int totalBalance = account.get(0) + depositAmount;
                    account.set(0, totalBalance);
                } else {
                    account.add(depositAmount);  //TODO: print the total amount
                }  
                System.out.println("Total Balance  : " + account.get(0));
                break;

            case 2:
                // withdraw
                System.out.println("Enter the amount to withdraw :");
                int withdrawAmount = sc.nextInt();
                
				// TODO : add if to check available balance to withdraw else throw exception
/*
 * the code is updated with some changes
 * from original code. 
 * instead  of using a loop,
 * the code directly access the balance using account.get(0) which is more efficient
 * the balance is update using account.set(0, totalBalance),  which is clear to avoids unnecessary list operations.   
 * so below the code is updated
 */
 
                if (account.isEmpty() || account.get(0) < withdrawAmount) {
                    System.out.println("You don't have sufficient balance to withdraw money, please add sufficient amount.");
                } else {
                    int totalBalance = account.get(0) - withdrawAmount;
                    account.set(0, totalBalance);
                    System.out.println("Total Balance  : " + totalBalance);
                }
                break;
                
            case 3:
                // check balance
                if (account.isEmpty()) {
                    System.out.println("Your account is empty.");
                } else {
                    System.out.println("Total Balance  : " + account.get(0));
                }
                break;

            case 4:
                // exit
                flag = false;
                break;

            default:
                System.out.println("Invalid input, try with correct input");
 
			}
		}
			
		System.out.println("Thank you for using our service...");
        sc.close();
			
		
	}

}
