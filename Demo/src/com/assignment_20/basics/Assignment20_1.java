package com.assignment_20.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* Write program to add the five students mobile number into arraylist 
 * and iterate that elements using iterator. 
 * 
 */

public class Assignment20_1 {

	public static void main(String[] args) {
		
	        ArrayList<String> mobileNo = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter five student mobile numbers:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Mobile number " + (i + 1) + ": ");
	            String number = sc.nextLine();
	            mobileNo.add(number);
	        }

	        Iterator<String> iterator = mobileNo.iterator();
	        System.out.println("\nStudent Mobile Numbers:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        
	}

}
