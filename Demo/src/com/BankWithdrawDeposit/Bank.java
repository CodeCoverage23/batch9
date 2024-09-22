package com.BankWithdrawDeposit;

import java.util.LinkedList;
import java.util.Scanner;

class InsufficientBalance extends Exception {
	public InsufficientBalance(String msg) {
		super(msg);
	}
}

public class Bank {

	static LinkedList<Integer> l = new LinkedList<>();

	public static void main(String[] args) throws InsufficientBalance {
		Scanner sc = new Scanner(System.in);

		System.out.println("***** Welcome to Code Coverage Bank *****");
		int flag = 1;

		while (flag == 1) {
			System.out.println("Choose Operation Number :");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Check balance");
			System.out.println("0 : Exit");
			int n = sc.nextInt();

			switch (n) {

			case 1: {
				System.out.println("Enter a amount to withdraw : ");
				int withdrawAmount = sc.nextInt();

				try {
					withdraw(withdrawAmount);
				} catch (InsufficientBalance e) {
					System.out.println(e.getMessage());
				}
				break;
			}

			case 2: {
				System.out.println("Enter a amount to deposit : ");
				int depositAmount = sc.nextInt();

				deposit(depositAmount);
				break;
			}

			case 3: {
				if (l.isEmpty()) {
					System.out.println("Money is not deposited yet... please add money");
				}
				for (int balance : l) {
					System.out.println("Total balance : " + balance);
				}

				break;
			}

			case 0: {
				flag = 0;
				break;
			}

			default:
				System.out.println("Invalid input");

			}
			System.out.println();

		}
		System.out.println("***** Thanks to visit Code Coverage Bank *****");

	}

	public static void deposit(int depositAmount) {
		if (!l.isEmpty()) {
			for (int balance : l) {
				int totalBalance = balance + depositAmount;
				totalBalance(totalBalance);
			}
		} else {
			l.add(depositAmount);
			System.out.println("Total Balance : " + depositAmount);
		}
	}

	public static void withdraw(int withdrawAmount) throws InsufficientBalance {
		if (l.isEmpty()) {
			throw new InsufficientBalance("Money is not deposited yet.... please add money");
		} else {
			for (Integer balance : l) {
				if (balance > withdrawAmount) {
					int totalBalance = balance - withdrawAmount;
					totalBalance(totalBalance);
				} else {
					throw new InsufficientBalance("you dont have sufficient balance.... please add money");
				}

			}
		}
	}

	public static void totalBalance(int totalBalance) {
		l.clear();
		l.add(totalBalance);
		System.out.println("Total Balance : " + totalBalance);
	}

}
