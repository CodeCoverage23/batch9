package com.rishi.string;

import java.util.Scanner;

public class FrequencyOfChars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check :");
		String str = sc.nextLine();

		int freq[] = new int[str.length()];
		int i, j;
		char[] strArray = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (strArray[i] == strArray[j]) {

					freq[i]++;
					strArray[j] = '0';
				}
			}

		}

		System.out.println("Characters and their corresponding frequencies...");

		for (i = 0; i < freq.length; i++) {

			if (strArray[i] != ' ' && strArray[i] != '0') {
				System.out.println(strArray[i] + " - " + freq[i]);
			}
		}

	}
}
