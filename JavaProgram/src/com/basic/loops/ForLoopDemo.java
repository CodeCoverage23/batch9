package com.basic.loops;

public class ForLoopDemo {

	public static void main(String[] args) {

		/*
		 * Print the numbers from 1 to 10
		 */

		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(1); System.out.println(1); System.out.println(1);
		 * System.out.println(1); System.out.println(1); System.out.println(1);
		 * System.out.println(1); System.out.println(10);
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// print table of 5
		/*
		 * System.out.println(5 * 1); System.out.println(5 * 2); System.out.println(5 *
		 * 3); System.out.println(5 * 4); System.out.println("."); System.out.println(5
		 * * 10);
		 */
		
		System.out.println("====================");

		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}

	}

}