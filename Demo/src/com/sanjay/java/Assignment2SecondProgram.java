package com.sanjay.java;

public class Assignment2SecondProgram {
	//print first character of your name on console.

	public static void firstCharacter(String str)
    {
	 int a = str.length();
	 char first = str.charAt(0);

System.out.println("First Character of Name is: " + first);
}
public static void main(String args[])
    {
	String str = "Sanjay";
	firstCharacter(str);


}
}

