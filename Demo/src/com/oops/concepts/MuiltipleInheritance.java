package com.oops.concepts;

interface Test4 {
	public void display();
}

interface Test5 {
	public void display();
}

public class MuiltipleInheritance implements Test4, Test5 {

	@Override
	public void display() {
		System.out.println("Code Coverage");
	}

	public static void main(String[] args) {
		MuiltipleInheritance m = new MuiltipleInheritance();

		m.display();
	}

}
