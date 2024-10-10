package com.assignment_18.basics;

/* Suppose You have given an integer array containing 1 to n
 * but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number. Number can not be repeated in the array. 
 */


public class Assignment18_1 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5}; // Example array with missing number 4
        int n = 5; // The number n

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2; //the sum of the first n natural no. formula is given
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
        
		
	}

}
