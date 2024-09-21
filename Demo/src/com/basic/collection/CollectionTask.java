package com.basic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class is use to implement DEPOSIT and WITHDRAW functionality
 */
public class CollectionTask {

	static List<Integer> account = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to our application..!");
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("Enter 1 for Deposit");
			System.out.println("Enter 2 for Withdraw");
			System.out.println("Enter 3 for Exit");
			// TODO : case 4 to check the balance
			int userChoise = sc.nextInt();

			switch (userChoise) {
			case 1:
				// deposit
				System.out.println("Enter the amount to deposit :");
				int depositAmount = sc.nextInt();

				if (!account.isEmpty()) {
					for (int balance : account) {
						int totalBalance = balance + depositAmount;
						account.clear();
						account.add(totalBalance);
						System.out.println("Total Balance  : " + totalBalance);
					}

				} else {
					account.add(depositAmount);
					// TODO : print the total amount
				}

				break;
			case 2:
				// withdraw
				System.out.println("Enter the amount to withdraw :");
				int withdrawAmount = sc.nextInt();

				if (account.isEmpty()) {
					System.out.println("You don't have sufficient balance to Withdraw, Please add the money");
				}

				for (Integer balance : account) {
					// TODO : add if to check available balance to withdraw else throw exception
					int totalBalance = balance - withdrawAmount;
					account.clear();
					account.add(totalBalance);
					System.out.println("Total Balance  : " + totalBalance);

				}

				break;
			case 3:
				// exit
				flag = false;
				break;
			default:
				System.out.println("Invalid input, try with correct input");

			}
		}

		System.out.println("Thank you for using our service...");

	}

}
