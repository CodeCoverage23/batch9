package com.basic.loops;

public class WhileLoopDemo {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {
			System.out.println(i * 2);
			i++;
		}

		while (true) {
			System.out.println("I am never ending while loop");
		}
	}

}