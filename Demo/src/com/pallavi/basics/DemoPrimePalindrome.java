package com.pallavi.basics;

public class DemoPrimePalindrome {

	public static void main(String[] args) {
		System.out.println("Prime number between 1 to 1000: ");
		for(int i = 1; i<=1000; i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
		
		
		System.out.println("\n\nPalindrome numbers between 1 to 1000: ");
		for(int i = 1; i<=1000; i++) {
			if(isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
		//method to check if a number is prime
		public static boolean isPrime(int num) {
			if(num <= 1) {
				return false;
				
			}
			
			for(int i =2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		//Method to check if a number is a palindrome
		
		public static boolean isPalindrome(int num) {
			int original = num;
			int reverse = 0;
			while(num != 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num /= 10;
				
			}
			
					
			return original ==reverse;
		
		
	}

}
