import java.util.Scanner;


public class Main {

	static int SIZE = 100;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[100];
		
		
		for(int i = 0; i < SIZE; i++) {
			array[i] = (int)(Math.random() * 10000) + 1;
		
		}
		
		
		try {
			System.out.println("Which location do you want the number from (0-99)");
			int i = input.nextInt();
			
			System.out.println("Your value is " + array[i]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not a number 0-99");
		}
		
		catch(Exception e){
			System.out.println("not a number");
		}
	}
}
