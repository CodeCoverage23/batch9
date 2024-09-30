package com.Assignment12;

import java.util.Scanner;

/*Account
int : accountNumber
String: accountName
void :getAccountDetails()
void: getAccountInformation()

SavingAccount
String : accountType
long: balance
void :getSavingAccountDetails()
void: getSavingAccountInformation()
*/
class Account {
	int accountNumber;
	String accountName;
	
	Scanner sc=new Scanner(System.in);
	void getAccountDetails() {
		System.out.println("Enter account number : ");
		accountNumber=sc.nextInt();
		System.out.println("Enter the account name : ");
		accountName=sc.next();
		
		
	}
	void getAccountInformation() {
		
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Name : "+accountName);
	}

}
class SavingAccount extends Account{
	String accountType;
	long balance;
	void getSavingAccountDetails() {
		System.out.println("Enter account type : ");
		accountType=sc.next();
		System.out.println("Enter the balance : ");
		balance=sc.nextLong();
		
	}
	void getSavingAccountInformation() {
		System.out.println("Account Type : "+accountType);
		System.out.println("Account Balance : "+balance);
	}

} 

public class Que1{
	public static void main(String []args) {
		
		SavingAccount s=new SavingAccount();
		System.out.println("Please Enter Information Below : ");
		s.getAccountDetails();
		s.getSavingAccountDetails();
		
		
		System.out.println("**************************************");
		System.out.println("Acount Details -->> ");
		s.getAccountInformation();
		s.getSavingAccountInformation();
	}
}




















