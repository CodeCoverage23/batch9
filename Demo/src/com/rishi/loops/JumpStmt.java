package com.rishi.loops;

public class JumpStmt {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		System.out.println();

		for (int j = 1; j <= 25; j++) {

			if (j % 2 == 0 || j == 15) {
				continue;
			}
			System.out.println(j);
		}

	}

}
