//Joseph Pobega
// COMP 171



import java.util.Scanner;

public class hw_3 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month;
		int year;
		String days;
		System.out.println("Enter the month:");
		month = input.next();
		System.out.println("Enter the year:");
		year = input.nextInt();
		
		if (month == "january"); 
			days = "31";
		
		if (month == "febuary"); 
			days = "28";
		
		if (month == "march"); 
			days = "31";
		
		if (month == "april"); 
			days = "30";
		
		if (month == "may"); 
			days = "31";
		
		if (month == "june"); 
			days = "30";
		
		if (month == "july"); 
			days = "31";
		
		if (month == "august"); 
			days = "31";
		
		if (month == "september"); 
			days = "30";
		
		if (month == "october"); 
			days  = "30";
		
		if (month == "november"); 
			days = "30";
		
		if (month == "december") 
			days = "31";
		
		
		
		
		
		System.out.println(month +  year + " has " +  days + " days");
		
		
		

	}

}
