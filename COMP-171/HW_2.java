//Joseph Pobega
//COMP 171-003
//HW #2



import java.util.Scanner;

public class HW_2 {

	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double AnnualInvestmentAmount, AnnualInterestRate, MonthlyInterestRate, years, fiv;
		
		System.out.println("Enter your Annual investment amount:");
		AnnualInvestmentAmount = input.nextDouble();
		System.out.println("Enter your Annual interest rate:");
		AnnualInterestRate = input.nextDouble();
		System.out.println("Enter the number of years:");
		years = input.nextDouble();
		MonthlyInterestRate = (AnnualInterestRate/1200);
		fiv = AnnualInvestmentAmount * (Math.pow(1+MonthlyInterestRate,years*12));
		System.out.println("your future investment is: " + "$" + fiv);
	}

}
