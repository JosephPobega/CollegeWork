//Joseph Pobega
//COMP-171


import java.util.Scanner;
public class HW_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int investmentAmount = 0, years = 30;
		
		double monthlyInterestRate, annualInterest, investment;
		investmentAmount += 0;
		
		System.out.println("What is your investment value?:");
		investmentAmount = input.nextInt();
		System.out.println("Enter the interest rate:");
		annualInterest = input.nextDouble()/100;
		totalInvestment(investmentAmount, annualInterest/12,30);
	}
	public static double totalInvestment(double investmentAmount, double annualInterest, int years) {
		double invest=0;int counter=0;
		System.out.println("Years\t\tFuture Value");
		for (counter += 1; counter <= years; counter++) {
			invest = investmentAmount*(Math.pow(1+annualInterest,counter*12));
			invest = Math.round(invest*100.0)/100.0;
			System.out.println(counter+ "\t\t " + invest);
		}
		
		return invest;
		
		
	}

}

/*
 What is your investment value?:
1000
Enter the interest rate:
9
Years		Future Value
1		 1093.81
2		 1196.41
3		 1308.65
4		 1431.41
5		 1565.68
6		 1712.55
7		 1873.2
8		 2048.92
9		 2241.12
10		 2451.36
11		 2681.31
12		 2932.84
13		 3207.96
14		 3508.89
15		 3838.04
16		 4198.08
17		 4591.89
18		 5022.64
19		 5493.8
20		 6009.15
21		 6572.85
22		 7189.43
23		 7863.85
24		 8601.53
25		 9408.41
26		 10290.99
27		 11256.35
28		 12312.28
29		 13467.25
30		 14730.58
*/
