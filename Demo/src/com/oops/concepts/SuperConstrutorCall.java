package com.oops.concepts;

class Test {

	Test() {
		System.out.println("Parent class constructor");
	}
}

public class SuperConstrutorCall extends Test {

	SuperConstrutorCall() {
		super();
		System.out.println("Child class Constructor");

	}

	public static void main(String[] args) {
		SuperConstrutorCall superConstrutorCall = new SuperConstrutorCall();
	}

}
