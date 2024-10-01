package com.Assignment16;

import java.util.Scanner;

/*
 * 1. Design the Product class in which design void productCheck(int weight) in check 
 * whether weight is less than 100, then throw the ProductException  with a meaningful message. 
 * 2. Design the ProductException class in which write custom exceptions.
 * 3. Create MainProduct class in which pass the input to productCheck method with try and catch block.
 */

class Product{
	void productCheck(int weight) throws ProductException {
		if(weight<100) {
			throw new ProductException("Product Weight is too light, must be atleast 100");
		}
		else {
			System.out.println("Product weight is valid : "+weight);
		}
	}
}

class ProductException extends Exception{
	ProductException(String msg){
		super(msg);
	}
}
public class MainProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product weight : ");
		int w=sc.nextInt();
		Product p=new Product();
		try {
			p.productCheck(w);
		} catch (ProductException e) {
			System.out.println("Exception Found : "+e.getMessage());
		}
		}
}

