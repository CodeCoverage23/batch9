package Assignment6.java;

import java.util.Scanner;  

public class Assignment6_2 {

//WAP method void multiplication (int no) and print the multiplication table.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter a number-- ");  
		
		int num=sc.nextInt();  
		
		for(int i=1; i <= 10; i++)  
		{
			System.out.println(num+" * "+i+" = "+num*i);  
		}

	}

}
