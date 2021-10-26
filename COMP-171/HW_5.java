package hw_5;

import java.util.Scanner;

public class hw_5 {

	public static void main(String[] args) {
		

			Scanner input = new Scanner(System.in);
			Double numberYears, loanAmount, AnnualInterestRate=5.0, MonthlyInterestRate, monthlyPayment, totalPayment;
		
			
			System.out.println("Enter loan amount: ");
				loanAmount = input.nextDouble();
				System.out.println("Enter number of years: ");
				numberYears = input.nextDouble();
				System.out.println("Interest Rate	Monthly Payment	  Total Payment");
				
				while(AnnualInterestRate <= 8) {
					MonthlyInterestRate = AnnualInterestRate/1200;
					monthlyPayment = loanAmount * MonthlyInterestRate  /  (1 - 1 / Math.pow(1 + MonthlyInterestRate, numberYears * 12)); 
					totalPayment = monthlyPayment * numberYears * 12;
					System.out.printf("%5.3f%s\t\t%6.2f\t\t%5.2f\n", AnnualInterestRate, '%', monthlyPayment, totalPayment);
					AnnualInterestRate += 0.125;
				}
			}
}

		

	
