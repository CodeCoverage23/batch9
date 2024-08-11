package com.oops.concepts;

class Paint {

	String color;

	public Paint(String color) {
		this.color = color;
	}

	public void display() {
		System.out.println(this.color);
		this.colorCompany();
	}

	public void colorCompany() {
		System.out.println("Asian...");
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * Paint p = new Paint("Yellow");
	 * 
	 * this.display(); this and super is non static context so this operation is not
	 * allowed
	 * 
	 * 
	 * p.display(); }
	 */
}

public class SuperThisDemo extends Paint {

	public SuperThisDemo(String color) {
		super(color);

		System.out.println("User keyword use.." + super.color);
	}

	public static void main(String[] args) {
		SuperThisDemo superThisDemo = new SuperThisDemo("Blue");
		superThisDemo.display();
	}
}
