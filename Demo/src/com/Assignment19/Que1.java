package com.Assignment19;

import java.util.Scanner;

//1. Design a method for counting the alphabet, vowels and numbers from String. 
//Input should be from user into main method and pass that to methods. And result will print into main method 
class CountC{
	int countAlpha=0;
	int countVowel=0;
	int countNum=0;
	String vowels="aeiou";
	
	public void count(String s) {
		int l=s.length();
		for(int i=0;i<l;i++) {
			if(vowels.indexOf(s.charAt(i))!= -1) {
				countVowel++;
			}
			if(Character.isLetter(s.charAt(i))){
				countAlpha++;
			
			}
			if(Character.isDigit(s.charAt(i))){
				countNum++;
			}
		}
	}
}
public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		s.toLowerCase();
		CountC p=new CountC();
		p.count(s);
		System.out.println("Count Of : ");
		System.out.println("Alphabates : "+p.countAlpha);
		System.out.println("Vowels : "+p.countVowel);
		System.out.println("Numbers : "+p.countNum);
		

	}

}
