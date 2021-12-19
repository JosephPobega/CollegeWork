//Joseph Pobega
//COMP 171

import java.util.Scanner;
public class HW_6 {

	 public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int num_years = 30; 

		
		  System.out.print("\nEnter investment amount: ");
		  double amount = input.nextDouble();
		  System.out.print("Enter annual interest percentage: ");
		  double annualInterestRate = input.nextDouble();
		  double monthlyInterestRate = annualInterestRate / 1200;
		  System.out.println("Years     Future Value");
		  
		  for (int i = 1; i <= num_years; i++) {
		   System.out.printf("%-10d", i);
		   System.out.printf("%11.2f\n", 
		    futureInvestmentValue(amount, monthlyInterestRate, i));
		  }
		 }
	 
		 public static double futureInvestmentValue(
			 double investmentAmount, double monthlyInterestRate, int years) {
			 return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		 }
		}


/*
Enter investment amount: 1200
Enter annual interest percentage: 12
Years     Future Value
1             1352.19
2             1523.68
3             1716.92
4             1934.67
5             2180.04
6             2456.52
7             2768.07
8             3119.13
9             3514.71
10            3960.46
11            4462.75
12            5028.74
13            5666.51
14            6385.16
15            7194.96
16            8107.46
17            9135.69
18           10294.33
19           11599.91
20           13071.06
21           14728.80
22           16596.78
23           18701.67
24           21073.51
25           23746.16
26           26757.77
27           30151.32
28           33975.26
29           38284.18
30           43139.57
*/
