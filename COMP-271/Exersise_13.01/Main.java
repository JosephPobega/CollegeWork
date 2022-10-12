import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three tides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a color: ");
		String color = input.next();
		
		System.out.println("Is the triangle filled? true or false: ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(triangle);

	}

}
