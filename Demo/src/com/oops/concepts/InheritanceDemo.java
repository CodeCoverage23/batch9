package com.oops.concepts;

/**
 * Simple inheritance
 */
class Animal {

	int legs;

	public void eat() {
		System.out.println("Eating....");
	}

}

public class InheritanceDemo extends Animal {

	public void bark() {
		System.out.println("Barking...");
	}

	public static void main(String[] args) {

		InheritanceDemo i = new InheritanceDemo();

		i.legs = 4;

		System.out.println(i.legs);

		i.eat();
		i.bark();

	}
}
