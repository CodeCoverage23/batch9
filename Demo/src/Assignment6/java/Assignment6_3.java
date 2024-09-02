package Assignment6.java;

public class Assignment6_3 {
	
	//WAP print all even number from 50 to 75.

	public static void main(String[] args) {
	
		int number = 75;
		
		System.out.print("List of even numbers from 50 to "+number+">>> "); 
		
		for(int i=50; i<=number ; i++) {
			
			if(i%2==0) {
				
				System.out.print(i + " "); 
			}
		}
		

	}

}
