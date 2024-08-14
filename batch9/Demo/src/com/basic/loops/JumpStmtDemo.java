package com.basic.loops;

public class JumpStmtDemo {

	public static void main(String[] args) {

		// use of break stmt
		int i;

		for (i = 1; i <= 10; i++) {

			System.out.println(i);

			if (i == 5)
				break;

		}
		System.out.println("============================");

		/**
		 * uses of logical and and break stmt 
		 * Logical and (&&) - Needs both the conditions true 
		 * Logical or (||) - Needs single condition true to in enter into the loop
		 */
		for (i = 1; i <= 25; i++) {
			System.out.println(i);
			if (i % 2 == 0 && i == 16) {
				break;
			}

		}
		System.out.println("============================");
		
		// use of continue stmt
		for (i = 1; i <= 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}
		
		System.out.println("Last ============================");

		for (i = 1; i <= 25; i++) {

			if (i % 2 == 0 || i == 15) {
				continue;
			}
			System.out.println(i);
		}

	}

}
