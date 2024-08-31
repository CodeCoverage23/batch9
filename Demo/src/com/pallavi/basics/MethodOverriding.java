package com.pallavi.basics;

class Owner{
	
	public void buy()
	{
		System.out.println("Buy French Bulldog");
	}
}
	


	
public class MethodOverriding  extends Owner{
	public static void main(String[] args) {
		
	MethodOverriding demo = new MethodOverriding();
	demo.buy();
	
	}
	@Override
	public void buy() {
		System.out.println("Buy Siberian Husky");
	
	}
}


