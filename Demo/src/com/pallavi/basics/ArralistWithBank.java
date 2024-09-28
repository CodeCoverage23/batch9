package com.pallavi.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArralistWithBank {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double balance = 0.0;
	        boolean exit = false;
	        ArrayList<String> transactions = new ArrayList<>();

	        while (!exit) {
	            System.out.println("Choose an option:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. View Transactions");
	            System.out.println(". Exit");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
                        System.out.println("Current Balance: " + balance);
                        break;
	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        transactions.add("Withdrawn: " + withdrawAmount);
	                        System.out.println("Withdrawal successful. New balance: " + balance);
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    balance += depositAmount;
	                    transactions.add("Deposited: " + depositAmount);
	                    System.out.println("Deposit successful. New balance: " + balance);
	                    break;
	                case 4:
	                    System.out.println("Transaction History:");
	                    for (String transaction : transactions) {
	                        System.out.println(transaction);
	                    }
	                    break;
	               
	                case 5:
	                    exit = true;
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        scanner.close();
	    }
	}



