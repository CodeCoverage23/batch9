package com.BankWithdrawDeposit;

import java.util.LinkedList;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("***** Welcome to Code Coverage Bank *****");
		int flag=1;
		
		LinkedList<Integer> l=new LinkedList<>();
		while(flag==1) {
			System.out.println("Choose Operation Number :");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Show List");
			System.out.println("0 : Exit");
			int n=sc.nextInt();
			
			switch(n) {
			case 1 : {
				System.out.println("Enter a amount to withdraw : ");
				int m=sc.nextInt();
				if(l.isEmpty()) {
					System.out.println("No amount is deposited yet! ");
				}else {
				   if(l.contains(m)) {
					   l.remove(Integer.valueOf(m));
					   System.out.println("Amount "+m +" is withdraw from list ");
				   }
				   else {
					   System.out.println("Amount "+m+" is not found is list ");
				   }
				}
				break;
			}
			case 2 : {
				System.out.println("Enter a amount to deposit : ");
				int m=sc.nextInt();
				l.add(m);
				System.out.println("Amount deposited : "+m);
				break;
			}
			case 3 : {
				System.out.println("List of amounts : ");
				System.out.println(l);
				break;
			}
			case 0 : {
				flag=0;
			}
			}
			System.out.println();
			
		}
		System.out.println("***** Thanks to visit Code Coverage Bank *****");
		

	}

}
