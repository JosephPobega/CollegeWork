import java.util.Scanner;
public class HW_6 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		double investmentAmount, monthlyInterestRate, future, years;
		System.out.println("How much would you like to invest?:");
		investmentAmount = input.nextDouble();
		System.out.println("Enter interest rate:");
		monthlyInterestRate = input.nextDouble();
	}

	public static double FutureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		fiv = investmentAmount * ( Math.pow(1+monthlyInterestRate, years*12));
	}
}
