package com.assignment_15.basics;

import java.util.Scanner;

/*2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 
*/

class Account{
	private int id;
	private String accountNumber;
	private double balance;
	
	public Account(int id, String accountNumber, double balance) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
	
	class SavingAccount extends Account{
		private double withdrawAmount;

		public SavingAccount(int id, String accountNumber, double balance,  double withdrawAmount) {
			super(id, accountNumber, balance);
			this.withdrawAmount = withdrawAmount;
		}

		public double getWithdrawAmount() {
			return withdrawAmount;
		}

		public void setWithdrawAmount(double withdrawAmount) {
			this.withdrawAmount = withdrawAmount;
		}
		
		//method to withdraw amount
		public void withdraw(double amount) {
			if(amount <= getBalance()) {
			
				setBalance(getBalance() - amount);
				this.withdrawAmount = amount;
			}
			else {
				System.out.println("Insufficient balance.");
			}
			
		}
		
		}


public class Assignment15_2 {
	//method to get account details from user
	public Account getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Account number: ");
		String accountNumber = sc.next();
		
		System.out.println("Enter Account balance: ");
		double balance = sc.nextDouble();
		
		return new SavingAccount(id, accountNumber, balance, 0.0);
		
 }
	//static method to get withdraw details
	
	public static int getWithdrawDetails(Account account) {
		if(account instanceof SavingAccount) {
			SavingAccount savingAccount = (SavingAccount) account;
			return (int) savingAccount.getWithdrawAmount();
			
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment15_2 details = new Assignment15_2();
		
		//get account details from user
		Account account = details.getAccountDetails();
		
		//check if the account is a savingAccount
		 if (account instanceof SavingAccount) {
	            SavingAccount savingAccount = (SavingAccount) account;

	            // Get withdrawal amount from user
	            System.out.print("Enter amount to withdraw: ");
	            double amount = sc.nextDouble();

	            // Perform withdrawal
	            savingAccount.withdraw(amount);
	            System.out.println("Withdrawn Amount: " + getWithdrawDetails(savingAccount));
	            System.out.println("Remaining Balance: " + savingAccount.getBalance());
	        } else {
	            System.out.println("Account is not a SavingAccount.");
	        }
		 sc.close();
	}

}
