package com.Assignment13;

import java.util.Scanner;

/*
 * 1. Design the interface which contain below method public void getSavingAccount();
public void getUserDetails(String name,float balance); Then design the new class called as 
AccountImpl and implement that method, below input should be taken from user as name 
and balance into getSavingAccount method and pass input and print it into getUserDetails method.

 */
interface Account{
	public void getSavingAccount();
	public void getUserDetails(String name,float balance);
}

class AccountImpl implements Account{
	String name;
	float balance;
	

	@Override
	public void getSavingAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Balance");
		balance=sc.nextFloat();
		getUserDetails(name, balance);
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("Details -->>");
		System.out.println("Name : "+name);
		System.out.println("Balance : "+balance);
		
	}
	
}
public class Que {

	public static void main(String[] args) {
		AccountImpl a=new AccountImpl();
		a.getSavingAccount();
	}

}
