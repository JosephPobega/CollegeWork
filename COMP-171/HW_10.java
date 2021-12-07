//Joseph Pobega
//COMP 171

import java.util.Scanner;

public class HW_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		int wrong = 0;
		
		String [][] states = {
				{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Maryland", "Annapolis"},
                {"Minnesota", "Saint Paul"},
                {"Iowa", "Des Moines"},
                {"Maine", "Augusta"},
                {"Kentucky", "Frankfort"},
                {"Indiana", "Indianapolis"},
                {"Kansas", "Topeka"},
                {"Louisiana", "Baton Rouge"},
                {"Oregon", "Salem"},
                {"Oklahoma", "Oklahoma City"},
                {"Ohio", "Columbus"},
                {"North Dakota", "Bismark"},
                {"New York", "Albany"},
                {"New Mexico", "Santa Fe"},
                {"New Jersey", "Trenton"},
                {"New Hampshire", "Concord"},
                {"Nevada", "Carson City"},
                {"Nebraska", "Lincoln"},
                {"Montana", "Helena"},
                {"North Carolina", "Raleigh"},
                {"Missouri", "Jefferson City"},
                {"Mississippi", "Jackson"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
		};
		for (int i = 0; i < states.length; i++) {
			System.out.println("What is the capitol of " + states[i][0]);
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(states[i][1])) {
				System.out.print("Correct!");
				correct += 1;
			}
				else if (answer != states[i][1]) {
					System.out.println("Wrong!");
					wrong += 1;
				}
			}
		System.out.println("The correct count is: " + correct);
		System.out.println("The wrong count is: " + wrong);
		}
	
			
	}


/*
 What is the capitol of Alabama
montgomery
Correct!What is the capitol of Alaska
qijwfd
Wrong!
What is the capitol of Arizona
phoenix
Correct!What is the capitol of Arkansas
Little rock
Correct!What is the capitol of California
sacReMenTO
Wrong!
What is the capitol of Colorado
a
Wrong!
What is the capitol of Connecticut

aWrong!
What is the capitol of Delaware

Wrong!
What is the capitol of Florida
f
Wrong!
What is the capitol of Georgia

fWrong!
What is the capitol of Hawaii

dWrong!
What is the capitol of Idaho

Wrong!
What is the capitol of Illinois
s
Wrong!
What is the capitol of Maryland
s
Wrong!
What is the capitol of Minnesota
w
Wrong!
What is the capitol of Iowa
w
Wrong!
What is the capitol of Maine

Wrong!
What is the capitol of Kentucky
w
Wrong!
What is the capitol of Indiana

Wrong!
What is the capitol of Kansas
a
Wrong!
What is the capitol of Louisiana
a
Wrong!
What is the capitol of Oregon

Wrong!
What is the capitol of Oklahoma
d
Wrong!
What is the capitol of Ohio
d
Wrong!
What is the capitol of North Dakota
ds
Wrong!
What is the capitol of New York

Wrong!
What is the capitol of New Mexico
sd
Wrong!
What is the capitol of New Jersey

Wrong!
What is the capitol of New Hampshire

Wrong!
What is the capitol of Nevada
v
Wrong!
What is the capitol of Nebraska

fWrong!
What is the capitol of Montana

Wrong!
What is the capitol of North Carolina
f
Wrong!
What is the capitol of Missouri

Wrong!
What is the capitol of Mississippi
x
Wrong!
What is the capitol of Massachusetts

Wrong!
What is the capitol of Michigan
s
Wrong!
What is the capitol of Pennsylvania
a
Wrong!
What is the capitol of Rhode Island
s
Wrong!
What is the capitol of South Carolina

sWrong!
What is the capitol of South Dakota

Wrong!
What is the capitol of Tennessee
s
sdWrong!
What is the capitol of Texas

Wrong!
What is the capitol of Utah
d
Wrong!
What is the capitol of Vermont
s
Wrong!
What is the capitol of Virginia
d
dsWrong!
What is the capitol of Washington

sWrong!
What is the capitol of West Virginia

Wrong!
What is the capitol of Wisconsin
sa
Wrong!
What is the capitol of Wyoming
a
Wrong!
The correct count is: 3
The wrong count is: 47
 */

