// Joseph Pobega
//COMP 171


import java.util.Scanner;
public class HW_11 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		   System.out.print("How many students:");
		  int noStudents = input.nextInt();
		  double[] studentScores = new double[noStudents];
		  String[] names = new String[noStudents];
		  System.out.println("Enter the student name and their test score:");
		  for (int i = 0; i < studentScores.length; i++) {
		   names[i] = input.next();
		   studentScores[i] = input.nextDouble();
		      System.out.println("Next Student and score:");
		  }
		  
		  Sort (studentScores, names);
		  System.out.println(" List of student names and scores:");
		  for (int i = names.length - 1; i >= 0; i--) {
		   System.out.println(names[i] + ":" + studentScores[i] + "%");
		  }
		 }
		 public static void Sort(double[] list, String[] names) {
		  for (int a = 0; a < list.length - 1; a++) {
		   double currentMin = list[a];
		   int currentMinIndex = a;
		   for (int p = a + 1; p < list.length; p++) {
		    if (currentMin > list[p]) {
		     currentMin = list[p];
		     currentMinIndex = p;
		    }
		   }
		   if (currentMinIndex != a) {
		    list[currentMinIndex] = list[a];
		    list[a] = currentMin;
		    String temp = names[currentMinIndex];
		    names[currentMinIndex] = names[a];
		    names[a] = temp;
		   }
		  }
		 }
		 
		

	}

/*
 How many students:3
Enter the student name and their test score:
joe
10
Next Student and score:
brandon
90
Next Student and score:
liam
34
Next Student and score:
 List of student names and scores:
brandon:90.0%
liam:34.0%
joe:10.0%
 */


