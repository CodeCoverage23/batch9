package com.assignment12.basics;

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
    
    
    void getAccountDetails() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter account number: ");
    	accountNumber = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter account name: ");
    	accountName = sc.nextLine();
    	
    }
    
    void getAccountInformation() {
    	System.out.println("Account number: " + accountNumber);
    	System.out.println("Account Name: " + accountName);
    	
    }
    
    }
    
    class SavingAccount extends Account{
    	String accountType;
    	long balance;
    	
    	void getSavingAccountDetails() {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Account Type: ");
    		accountType = sc.nextLine();
    		System.out.println("Enter the Balance: ");
    		balance = sc.nextLong();
    		    		
    	}
    	
    	void getSavingAccountIformation() {
    		System.out.println("Account Type" + accountType);
    		System.out.println("Balance" + balance);;
    	}
    }
    
    
   public class Assignment12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.getAccountDetails();
		savingAccount.getSavingAccountDetails();
		System.out.println("\n Account Information: ");
		savingAccount.getAccountInformation();
		savingAccount.getSavingAccountIformation();
		sc.close();
		
		
		
	}

}
