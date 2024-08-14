package com.pallavi.basics;
/**
 * simple inheritance
 */

class Animal{
	int legs;
	public void eat() {
		System.out.println("Eating....");
	}
	
}

public class OopsConcepts extends Animal {
	
	public void bark() {
		System.out.println("Barking....");
	}

     public static void main(String[] args) {
    	 OopsConcepts i = new OopsConcepts();
    	 
    	 i.legs = 4;
    	 System.out.println(i.legs);
    	 
    	 i.eat();
    	 i.bark();
	
	}

}
