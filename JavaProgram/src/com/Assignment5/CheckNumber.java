 //.write a java program to check the number is positive or negative.

package com.Assignment5;
import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

       
        scanner.close();
    }
}
