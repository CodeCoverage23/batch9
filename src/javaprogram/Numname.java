package javaprogram;

public class Numname {

public static void main(String args[]) {
		
		int i;
		for(i=1;i<=100;i++) {
			
			if(i%5==0) {
				System.out.println("Pooja");
			}else if(i%7==0) {
				System.out.println("Hande");
			}
			else {
				System.out.println(+i);
			}
			if(i%5==0 && i%7==0) {
			System.out.println("Pooja Hande");
			}
		}  
	}
}
