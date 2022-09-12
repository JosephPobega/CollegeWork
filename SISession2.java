import java.util.Scanner;

public class SISession2 {

    public static Double area(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius of a cylinder: ");
            Double radius = input.nextDouble();
            Double areaa = (radius * radius * 3.14);
            System.out.println("The area of the cylinder is: ");
            return areaa;
    }

    public static Double volume(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of a cylinder: ");
            Double length = input.nextDouble();
            Double volumee = (area() * length);
            System.out.println("The volume of the cylinder is: ");
            return volumee;
        }
}








/*
2-1. How many variables would you need? (1 point)
    3
2-2. What datatype should you assign to the corresponding variables? (1 point)
    int
2-3. Using the Scanner class for the console input, should you invoke the .nextInt() or .nextDouble()method? Why? (1 point)
    .nextDouble()
2-4. Using a flowchart, Pseudocode and/or comments, show how you will structure your program. 
    
2-5. Name your class (program) SISession2 and show your running code. (1 point)
*/