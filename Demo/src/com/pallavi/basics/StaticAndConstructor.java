package com.pallavi.basics;


	
	
	class Mobile
	{
	
	String brand;
	int price;
	static String name;
	
	static 
	{
		name = "Phone";
		System.out.println("In static block");
	
	}

	public Mobile()
	{
		brand = "";
		price = 200000;
		System.out.println("In constructor");
		
	}
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name );
	}
	}
	
	
		
	public class StaticAndConstructor {
		
	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 2000000;
		Mobile.name = "Smartphone";
		
			
		
		
		
		
	}
	}

	

 
