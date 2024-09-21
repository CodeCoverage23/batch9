package com.BankWithdrawDeposit;

import java.util.LinkedList;
import java.util.Scanner;

public class Bank {
	
	static LinkedList<Integer> l=new LinkedList<>();
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("***** Welcome to Code Coverage Bank *****");
		int flag=1;
		
		
		while(flag==1) {
			System.out.println("Choose Operation Number :");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Check balance");
			System.out.println("0 : Exit");
			int n=sc.nextInt();
			
			switch(n) {
			case 1 : {
				System.out.println("Enter a amount to withdraw : ");
				int withdrawAmount=sc.nextInt();
				
				if(l.isEmpty()) {
					System.out.println("you dont have sufficient balance.... please add money");
				}
				else {
				for(Integer balance : l) {
					if(balance>withdrawAmount) {
						int totalBalance=balance-withdrawAmount;
						l.clear();
						l.add(totalBalance);
						System.out.println("Total Balance : "+totalBalance);
					}
					else {
						System.out.println("Not sufficient balance ");
					}
					
				}
				}
				
				break;
			}
			case 2 : {
				System.out.println("Enter a amount to deposit : ");
				int depositAmount=sc.nextInt();
				
				if(!l.isEmpty()) {
					for(int balance : l) {
						int totalBalance=balance + depositAmount;
						l.clear();
						l.add(totalBalance);
						System.out.println("Total Balance : "+totalBalance);
					}
				}
				else {
					l.add(depositAmount);
					System.out.println("Total Balance : "+depositAmount);
				}
				break;
			}
			case 3 : {
				for(int balance : l) {
					System.out.println("Total balance : "+balance);
				}
				
				break;
			}
			case 0 : {
				flag=0;
				break;
			}
			default: System.out.println("Invalid input");
			
			}
			System.out.println();
			
		}
		System.out.println("***** Thanks to visit Code Coverage Bank *****");
		

	}

}
