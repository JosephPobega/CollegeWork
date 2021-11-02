//Joseph Pobega
//COMP-171

import java.util.Scanner;
public class HW_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String phoneNumber, phoneNumber1;
		System.out.println("Enter a letter:");
		phoneNumber = input.nextLine();
		phoneNumber1 = "";
		
		for(int count = 0; count< phoneNumber.length();count++)
			if (number(phoneNumber.charAt(count)) != -1)
				phoneNumber1 += number(phoneNumber.charAt(count));
			else
				phoneNumber1 += phoneNumber.charAt(count);
		System.out.println(phoneNumber1);
		
		
	}
	
	
	public static int number(char letter){
		int phoneNumber = -1;

		if(letter == 'a' || letter == 'b' || letter == 'c') 
			phoneNumber = 2;
			
		
		else if(letter == 'd' || letter == 'e' || letter == 'f') 
			phoneNumber = 3;
			
		
		else if(letter == 'g' || letter == 'h' || letter == 'i') 
			phoneNumber = 4;
			
		
		else if(letter == 'j' || letter == 'k' || letter == 'l')  
			phoneNumber = 5; 
			
		
		else if(letter == 'm' || letter == 'n' || letter == 'o') 
			phoneNumber = 6;
			
		
		else if(letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') 
			phoneNumber = 7;
			
		
		else if(letter == 't' || letter == 'u' || letter == 'v') 
			phoneNumber = 8;
			
		
		else if(letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') 
			phoneNumber = 9;
			
	return phoneNumber;
		
	}
}
		
/*
Enter a letter:
1800flowers
18003569377

 */
