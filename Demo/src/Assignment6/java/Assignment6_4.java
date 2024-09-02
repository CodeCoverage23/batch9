package Assignment6.java;

public class Assignment6_4 {
	
//method int factorial(int no)  which returns int value to that method. print the results into main method

	public static void main(String args[]){  
		
			  int i,fact=1;  
			  
			  int number=5;
			  
			  for(i=1;i<=number;i++){   
				  
			      fact=fact*i;    
			  }    
			  
			  System.out.println("Factorial of number "+number+" is: "+fact);  
		}
}
