import java.util.Scanner;
public class HW_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count;
		String letter = null, phoneNumber;
		count = 1;
		phoneNumber = "";
		phoneNumber += "";
		number(letter, phoneNumber);
		
		while(count > 9) {
			number(letter, phoneNumber);
			System.out.println("Enter a letter");
			letter = input.nextLine();
		}
		System.out.println(phoneNumber);
		
	}
	
	
	public static void number(String letter, String phoneNumber) {

		if(letter == "a" || letter == "b" || letter == "c") {
			phoneNumber += "2";
		}
		else if(letter == "d" || letter == "e" || letter == "f") {
			phoneNumber += "3";
		}
		else if(letter == "g" || letter == "h" || letter == "i") {
			phoneNumber += "4";
		}
		else if(letter == "j" || letter == "k" || letter == "l") {  
			phoneNumber += "5";
		}
		else if(letter == "m" || letter == "n" || letter == "o") {
			phoneNumber += "6";
		}
		else if(letter == "p" || letter == "q" || letter == "r" || letter == "s") {
			phoneNumber += "7";
		}
		else if(letter == "t" || letter == "u" || letter == "v") {
			phoneNumber += "8";
		}
		else if(letter == "w" || letter == "x" || letter == "y" || letter == "z") {
			phoneNumber += "9";
		}
		
	}
}
		
	


