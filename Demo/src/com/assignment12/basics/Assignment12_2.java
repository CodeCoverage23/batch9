package com.assignment12.basics;

/*Bank
double : principleAmount
int: tenure
float: rateOfInterest

CanaraBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getCanraBankDetails()


AxisBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getAxisBankDetails()

UnionBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getUnionBankDetails()
*/



import java.util.Scanner;

class  Saving{
	double principleAmount;
	int tenure;
	float rateOfInterest;
}
	
	class CanaraBank extends Saving{
		double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
			return(principleAmount * tenure * rateOfInterest) / 100;
		}
		void getCanaraBankDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle Amount: ");
			principleAmount = sc.nextDouble();
			System.out.println("Enter the tenure: ");
			tenure = sc.nextInt();
			System.out.println("Enter rate of interest: ");
			rateOfInterest = sc.nextFloat();
		}
		
	
	}

  class AxisBank extends Saving{
	double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		return(principleAmount * tenure * rateOfInterest) / 100;
	}
	void getAxisBankDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle Amount: ");
		principleAmount = sc.nextDouble();
		System.out.println("Enter the tenure: ");
		tenure = sc.nextInt();
		System.out.println("Enter rate of interest: ");
		rateOfInterest = sc.nextFloat();
	}
	
	
}
  class UnionBank extends Saving{
	  double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
			return(principleAmount * tenure * rateOfInterest) / 100;
  }
	  void getUnionBankDetails() {
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle Amount: ");
			principleAmount = sc.nextDouble();
			System.out.println("Enter the tenure: ");
			tenure = sc.nextInt();
			System.out.println("Enter rate of interest: ");
			rateOfInterest = sc.nextFloat();
		
	  }
  }
  
  
  public class Assignment12_Two{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        CanaraBank canaraBank = new CanaraBank();
        System.out.println("Enter details for Canara Bank=>>");
        canaraBank.getCanaraBankDetails();
        double canaraInterest = canaraBank.getCalculateInterest(canaraBank.principleAmount, canaraBank.tenure, canaraBank.rateOfInterest);
        System.out.println("Calculated Interest for Canara Bank: " + canaraInterest);
        
        AxisBank axisBank = new AxisBank();
        System.out.println("\nEnter details for Axis Bank=>>");
        axisBank.getAxisBankDetails();
        double axisInterest = axisBank.getCalculateInterest(axisBank.principleAmount, axisBank.tenure, axisBank.rateOfInterest);
        System.out.println("Calculated Interest for Axis Bank: " + axisInterest);
        
        UnionBank unionBank = new UnionBank();
        System.out.println("\nEnter details for Union Bank=>>");
        unionBank.getUnionBankDetails();
        double unionInterest = unionBank.getCalculateInterest(unionBank.principleAmount, unionBank.tenure, unionBank.rateOfInterest);
        System.out.println("Calculated Interest for Union Bank: " + unionInterest);

        sc.close();


		
        


	

	}

}
