package com.assignment_16.basics;

import java.util.Scanner;

/*1. Design the Product class in which design void productCheck(int weight) in check 
whether weight is less than 100, then throw the ProductException  with a meaningful message.
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck method with try and catch block.
 */

class Product{
	public void productCheck(int weight)throws ProductException{
		if(weight < 100) {
			throw new ProductException("Product Weight is less than 100");
			
		}
	}
}
class ProductException extends Exception{
	public ProductException(String msg) {
		super(msg);
	}
	
	}
	
public class Assignment16_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.println("Enter the weight of the product: ");
		int weight = sc.nextInt();
		
		try {
			p.productCheck(weight);
			System.out.println("Product weight is acceptable...");
			
		}catch (ProductException e){
			System.out.println("Exception caught: " + e.getMessage());
		}
		finally{
			sc.close();
		}
        
	}


}
