package com.pallavi.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectioanTask {
	static List<Integer> account = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to our application..!");
        boolean flag = true;

      Scanner sc = new Scanner(System.in);
      
        while (flag) {
            System.out.println("Enter 1 for Deposit");
            System.out.println("Enter 2 for Withdraw");
            System.out.println("Enter 3 for Exit");
            System.out.println("Enter 4 to Check Balance"); // Implementing TODO: case 4 to check the balance
            int userChoice = sc.nextInt();

            switch (userChoice) {
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
                        System.out.println("Total Balance  : " + depositAmount); // Implementing TODO: print the total amount
                    }

                    break;
                case 2:
                    // withdraw
                    System.out.println("Enter the amount to withdraw :");
                    int withdrawAmount = sc.nextInt();

                    if (account.isEmpty()) {
                        System.out.println("You don't have sufficient balance to Withdraw money, Please add the sufficient balance");
                    }
                    for (Integer balance : account) {
                        if (balance < withdrawAmount) { // Implementing TODO: add if to check available balance to withdraw else throw exception
                            System.out.println("Insufficient balance to withdraw.");
                        } 
                        else
                        {
                            int totalBalance = balance - withdrawAmount;
                            account.clear();
                            account.add(totalBalance);
                            System.out.println("Total Balance  : " + totalBalance);
                        }
                    }

                    break;
                case 3:
                    // exit
                    flag = false;
                    break;
                case 4:
                    // check balance
                    if (account.isEmpty()) {
                        System.out.println("Your account is empty.");
                    } else {
                        System.out.println("Total Balance  : " + account.get(0));
                    }
                    break;
                default:
                    System.out.println("Invalid input, try with correct input");
            }
        }

        System.out.println("Thank you for using our service...");
        sc.close();
    }
}




            
            

