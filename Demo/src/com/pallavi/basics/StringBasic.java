package com.pallavi.basics;

public class StringBasic {

	public static void main(String[] args) {
		
		
		String name = new String("pallavi");
		System.out.println("Hello " + name);
		
		
		String name1 = new String("Pallavi");
		System.out.println(name1.charAt(1));
		
		String name2 = new String("Pallavi ");
		System.out.println(name2.concat("Ghodake"));
		
		String name3 = "Pallavi ";
		name3 = name3 + "Ghodake";
		System.out.println("Hello " +name3);
		
		String s1 = "Pallavi";
		String s2 = "Pallavi";
		System.out.println(s1==s2);
		
		String name4 ="Pallavi ";
		name4 = name4 + " Reddy";
	    System.out.println("Hello "  + name);
		
		String s3 = "Pallavi";
		String s4 = "Pallavi";
		System.out.println(s3 == s4);
		
	
		
		
	}

}
