package com.java.program;

public class SwitchProgram {

	public static void main(String[] args) {
          
		int month = 1 ;
		
		String monthString= "";
		
		switch(month) {
		
		case 1 : monthString="january";
		System.out.println("the month for the expresion is : "+monthString);
		break;
		case 2 : monthString="february";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 3 : monthString="march";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 4 : monthString="april";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 5 : monthString="may";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 6 : monthString="june";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 7 : monthString="july";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		case 8 : monthString="august";
		System.out.println("the month for the expresion is : "+monthString);

		break;
		
		default : System.out.println("invalid input");
		break;
		}
		
		
		
	}

}
