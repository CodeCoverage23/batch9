package com.oops.concepts;

class Animal2 {

	public void run() {
		System.out.println("Running...");
	}

	public void eat() {
		System.out.println("Eating...");
	}

}

class Cat extends Animal2 {

	public void mao() {
		System.out.println("MAO....");
	}

}

class Dog extends Animal2 {
	public void bark() {
		System.out.println("Barking...");
	}
}

public class HierarchicalInheriance extends Cat {

	public static void main(String[] args) {

		Cat h = new HierarchicalInheriance();

		h.mao();
		h.eat();
		h.run();

	}

}
