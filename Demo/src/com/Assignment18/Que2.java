package com.Assignment18;
//Suppose you have array that containing elements 10,20,30,10, 30,50,60 Find out duplicate elements 
//into array and print it.

public class Que2 {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,10, 30,50,60};
		int l=a.length;
		
		System.out.println("Duplicate Numbers : ");
		
		for(int i=0;i<l;i++) {
			int count =1;
			
			for(int j=i+1;j<l;j++) {
				if(a[i]==a[j] ){
					count++;
				}
			}
			if(count>1) {
				System.out.println(a[i]+" ");
			}
		}

	}

}
