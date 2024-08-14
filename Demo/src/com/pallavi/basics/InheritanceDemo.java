package com.pallavi.basics;

/**
 * simple inheritance
 */
class Dog{
	
	int legs;
	public void eat()
	{
		System.out.println("Eating...");
	}
	
}

public class InheritanceDemo extends Dog {
	public void bark() {
		System.out.println("Bark...");
	}

	public static void main(String[] args) {
		
		InheritanceDemo i = new InheritanceDemo();
				
		i.legs = 4;
		System.out.println(i.legs);
		
		i.eat();
		i.bark();

	}

}
