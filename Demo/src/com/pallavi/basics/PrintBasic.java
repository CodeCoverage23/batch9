package com.pallavi.basics;

import java.util.Scanner;

public class PrintBasic {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number top generate series : ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1 ; i <=num ; i++)
		{
			 if(i%5==0 && i%7==0) {
				System.out.println(i+"Last Name: Pallavi Ghodake");
			}	
			
		
		else if(i % 5 == 0 )
				
			{
				System.out.println( i + "First Name: Pallavi" );
				
			}
			else
				if(i % 7 == 0)
					
				{
					System.out.println(i + "last Name: Ghodake"  );
				}
				else
					{
						System.out.println(i);
					}
	}
		
		
		}
	}


