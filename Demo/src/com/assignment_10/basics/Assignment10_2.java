package com.assignment_10.basics;

/*Write a java program to display the Fibonacci series up to given number. (Fibonacci series mean next
 *number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5
 *then output is 0,1,1,2,3).
 *
 */



import java.util.Scanner;

public class Assignment10_2 {

	public static void main(String[] args) {
		
		int n, a = 0, b = 1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        sc.close();
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
	}

}
}
