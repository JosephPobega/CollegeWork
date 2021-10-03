
import java.util.Scanner;

public class HW_3 {

	public static void main(String[] args) {
		int month;
		int year;
		int days;
		int leapyear;
		int leapday;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats the month:(january-1,febuary-2, december-12, etc..");
		month = input.nextInt();
		System.out.println("Whats the year:");
		year = input.nextInt();
		
				
		if(month == 1) {
			days = 31;
			System.out.println("january " + year + days + " days");
				if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
			}
			}
		}
		else if(month == 2) {
			days = 28;
			leapday = 29;
			System.out.println("febuary " + year  + " has " + days + " days");
			else {
				if(year % 4 == 0) {
				if(year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}	
			}
			}
		
		else if(month == 3) {
			days = 31;
			System.out.println("march has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 4) {
			days = 29;
			System.out.println("april has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 5) {
			days = 31;
			System.out.println("may has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 6) {
			days = 30;
			System.out.println("june has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 7) {
			days = 31;
			System.out.println("july has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 8) {
			days = 31;
			System.out.println("august has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 9) {
			days = 31;
			System.out.println("september has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 10) {
			days = 30;
			System.out.println("october has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 11) {
			days = 30;
			System.out.println("november has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
		else if(month == 12) {
			days = 31;
			System.out.println("december has " + days + " days");
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.println("The year is a leapyear");
				}
				}
		}
	}

}
