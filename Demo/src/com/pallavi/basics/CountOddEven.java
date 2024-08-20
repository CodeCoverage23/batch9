package com.pallavi.basics;

public class CountOddEven {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		System.out.println("Even number: ");
		for(int i=1; i<=10000; i++) {
			if(i % 2 == 0) {
				evenCount++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nOdd number: ");
			for(int i=1; i<=10000; i++){
			if(i % 2 != 0) {
				oddCount++;
				System.out.print(i + " ");
			}
			}
			System.out.println("\n\nThe even number count: " +evenCount);
			System.out.println("The odd number count: " +oddCount);
		}
	}

