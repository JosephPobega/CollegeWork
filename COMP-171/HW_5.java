import java.util.Scanner;
public class HW_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double loanAmount, InterestRate, monthlyPayment, totalPayment, MonthlyRate;
		int numYears;
		InterestRate = 5.0;
		
		System.out.println("Enter loan amount: ");
		loanAmount = input.nextDouble();
		System.out.println("Enter number of years: ");
		numYears = input.nextInt();
		
		while(InterestRate <= .125) {
			monthlyPayment = loanAmount * InterestRate  /  (1 - 1 / Math.pow(1 + InterestRate, numYears * 12)); 
			totalPayment = monthlyPayment * numYears * 12;
			MonthlyRate = InterestRate / 1200;
			System.out.printf("%10.3f	%13.2f	%15.2f\n", monthlyPayment, totalPayment, MonthlyRate);
		}
	}

}
