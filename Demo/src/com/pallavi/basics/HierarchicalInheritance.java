package com.pallavi.basics;

class Dog2{
	public void run() {
		System.out.println("The dog is runnig...");
	}
	public void eat() {
		System.out.println("The dog is eating...");
	}
}

class Cat extends Dog2{
	public void mao() {
		System.out.println("The cat soud is Mao....");
	}
}
class Husky extends Dog2{
	public void bark() {
		System.out.println("The Siberian husky is barking...");
	}
}

public class HierarchicalInheritance extends Husky{

	public static void main(String[] args) {
		HierarchicalInheritance h = new HierarchicalInheritance();
		h.bark();
		h.eat();
		h.run();

	}

}
