package com.oops.concepts;

class A {
	public void add() {
		System.out.println("It will add the numbers");
	}
}

class B extends A {
	public void sub() {
		System.out.println("It will substract the numbers");
	}
}

class C extends B {
	public void mul() {
		System.out.println("It will multi the numbers");
	}
}

class D extends C {
	public void div() {
		System.out.println("It will div the numbers");
	}
}

public class MultilevelInheritance extends D {

	public void cal() {
		System.out.println("It shows calculations");
	}

	public static void main(String[] args) {

		MultilevelInheritance m = new MultilevelInheritance();

		m.cal();
		m.add();
		m.sub();
		m.mul();
		m.div();

	}

}
