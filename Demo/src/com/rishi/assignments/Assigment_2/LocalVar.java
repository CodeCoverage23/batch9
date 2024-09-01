package com.rishi.assignments.Assigment_2;

public class LocalVar {

	static int y = 25;// global variable

	public static void main(String[] args) {

		int x = 50;// Local Variable
		System.out.println(y + " is a global variable");
		System.out.println(x + " is a local variable");
		LocalVar l = new LocalVar();
		l.show();

	}

	public void show() {
		System.out.println(y + " is a global variable");
		// System.out.println(x); x is not accessible here
	}

}
