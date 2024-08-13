package javaprogram;
import java.util.Scanner;

public class Evenodduser {

	public static void main(String args[]) 
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : " );
		int num= s.nextInt();
		
		System.out.println("The entered number : " +num);
				
		if(num%2==0) 
		{	System.out.println("the number is EVEN" ); }
		
		else 
		{	System.out.println("the number is ODD" ); }
	}
}
