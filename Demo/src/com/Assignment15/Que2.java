package com.Assignment15;

import java.util.Scanner;

/*
 * 2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 

 */

class Account {
	int id, accountNumber;
	double balance;

	public Account(int id, int accountNumber, double balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}

class SavingAccount extends Account {
	int withdrawAmount;

	public SavingAccount(int id, int accountNumber, double balance, int withdrawAmount) {
		super(id, accountNumber, balance);
		this.withdrawAmount = withdrawAmount;
	}

}

class AccountDetails {
	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Details -->>");

		System.out.println("Enter Account Id : ");
		int id = sc.nextInt();

		System.out.println("Enter Account Number : ");
		int accountNumber = sc.nextInt();

		System.out.println("Enter Account Balance : ");
		double balance = sc.nextDouble();

		System.out.println("Enter Withdraw Amount : ");
		int withdrawAmount = sc.nextInt();

		System.out.println("******************************************");

		SavingAccount account = new SavingAccount(id, accountNumber, balance, withdrawAmount);

		// display details

		System.out.println("Account Details -->>");
		System.out.println("Account Id : " + account.id);
		System.out.println("Account Number : " + account.accountNumber);
		System.out.println("Account Name : " + account.balance);
		System.out.println("Account Withdraw Amount : " + account.withdrawAmount);

		if (account.balance >= account.withdrawAmount) {
			System.out.println("Remaining Balance After Withdrawal : " + getWithdrawDetails(account));
		} else {
			System.out.println("Insufficient Balance.....");
			System.out.println("Your current Balance " + account.balance);
		}
	}

	public static int getWithdrawDetails(Account account) {

		if (account instanceof SavingAccount) {
			SavingAccount savingAccount = (SavingAccount) account;	
			
			return (int) (savingAccount.balance -= savingAccount.withdrawAmount);
			
		}
		return (int) account.balance;
	}
}


public class Que2 {

	public static void main(String[] args) {
		AccountDetails a = new AccountDetails();
		a.getAccountDetails();
	}

}
