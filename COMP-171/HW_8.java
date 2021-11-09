//Joseph Pobega
//COMP 171


import java.util.Scanner;
public class HW_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] scores = new int [100];
		int entered=0;
		int oneScore;
		int elements;
		int sum=0;
		double avg;

		System.out.println("Enter a score or negative number to quit");
		oneScore = input.nextInt();
		while (oneScore > 0  && entered < scores.length) {

		scores[entered] = oneScore;
		    sum += scores[entered];
		    ++entered;
		System.out.println("Enter a test score or -1 to quit");
		oneScore = input.nextInt();
		}
		       avg= (sum/entered);
		       elements = entered;

		       for(entered=0;entered<elements;++entered) {
		       }        
		       for(int i = 0 ; i < entered ; i++){
		           sum += scores[i];
		       }
		       int aboveAverage = 0;
		       for(int i = 0 ; i < entered ; i++){
		          if(scores[i] > avg)
		              aboveAverage++;
		       }
		       int atAvg = 0;
		       for(int i = 0 ; i < entered ; i++){
		          if(scores[i] == avg)
		              atAvg++;
		       }
		       int belowAverage = 0;
		       for(int i = 0 ; i < entered ; i++){
		          if(scores[i] < avg)
		              belowAverage++;
		       }
		       System.out.println("The average score is: " + avg);
		       System.out.println("There are \nScores at average: "+atAvg+"\nScores above average:"+aboveAverage+"\nScores below average: "+belowAverage);

		}


	}
/*
Enter a score or negative number to quit
100
Enter a test score or -1 to quit
90
Enter a test score or -1 to quit
60
Enter a test score or -1 to quit
75
Enter a test score or -1 to quit
-1
The average score is: 81.0
There are 
Scores at average: 0
Scores above average:2
Scores below average: 2

 */


