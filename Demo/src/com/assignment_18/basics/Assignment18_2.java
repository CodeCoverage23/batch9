package com.assignment_18.basics;

/*
 * Suppose you have array that containing elements 10,20,30,10, 30,50,60 
 * Find out duplicate elements into array and print it.
 */

public class Assignment18_2 {

	public static void main(String[] args) {
		 int[] array = {10, 20, 30, 10, 30, 50, 60};
	     findDuplicates(array);
	  }

	    public static void findDuplicates(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println("Duplicate element: " + array[i]);
	                }
	            }
	        }
		}
}
