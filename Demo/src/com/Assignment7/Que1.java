package com.Assignment7;
//1. Design method to check whether the character is alphabet, digit and special symbol.
import java.util.Scanner;

public class Que1 {
	public static void checkCharacter(char c) {
		if((c>='A'&& c<='Z')||(c>='a'&&c<='z')) {
			System.out.println(c+" is a alphabet ");
		}
		else if(c>=0 && c<=9) {
			System.out.println(c+" is a number ");
		}
		else {
			System.out.println(c+" is a symbol");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s=sc.next().charAt(0);
		checkCharacter(s);

	}

}
