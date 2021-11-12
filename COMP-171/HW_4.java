import java.util.Scanner;
public class HW_4 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		char letter;
		String phone;
		

		for (int i=0; i<9; i++) {
			System.out.println("Enter a letter: ");
			phone = input.next();
			charToT9Number(phone.charAt(0));
		}
	}

	
	public static void charToT9Number(char letter) {
		switch (Character.toString(letter).toUpperCase()) {
			case "A":
			case "B": 
			case "C": 
				System.out.println("2");
				break;
			case "D":
			case "E":
			case "F":
				System.out.println("3");
				break;
			case "G": 
			case "H":
			case "I":
				System.out.println("4");
				break;
			case "J":
			case "K":
			case "L":
				System.out.println("5");
				break;
			case "M":
			case "N":
			case "O":
				System.out.println("6");
				break;
			case "P":
			case "Q":
			case "R":
			case "S":
				System.out.println("7");
				break;
			case "T":
			case "U":
			case "V":
				System.out.println("8");
				break;
			case "W":
			case "X":
			case "Y":
			case "Z":
				System.out.println("9");
				break;
			default:
				System.out.println("That wasn't a letter!");
		}
	}
}
