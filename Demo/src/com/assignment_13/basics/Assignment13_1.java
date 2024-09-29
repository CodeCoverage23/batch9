package com.assignment_13.basics;

import java.util.Scanner;

/*Design the interface which contain below method public void getSavingAccount();
public void getUserDetails(String name,float balance); Then design the new class called as 
AccountImpl and implement that method, below input should be taken from user as name 
and balance into getSavingAccount method and pass input and print it into getUserDetails method.
output from user
*/

interface Account {
    void getSavingAccount();
    void getUserDetails(String name, float balance);
}

class AccountImpl implements Account {
    private String name;
    private float balance;

    @Override
    public void getSavingAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your balance: ");
        balance = sc.nextFloat();
        getUserDetails(name, balance);
        sc.close();
    }
    
    @Override
    public void getUserDetails(String name, float balance) {
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Assignment13_1 {

	public static void main(String[] args) {
		AccountImpl account = new AccountImpl();
        account.getSavingAccount();

	}

}
