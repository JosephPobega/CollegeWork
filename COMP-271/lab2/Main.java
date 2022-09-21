package lab2;

public class Main {
	public static void main(String[] args) {
		
		//In the main create an array of 100 frogs
		Frog[] frogs = new Frog[100];
		
		int age;
		int totalAge = 0;
		//In the main fill the array with 100 frogs and give each frog a random age between 1 and 100
		for(int i=0; i < frogs.length; i++) {
			age = (int)(Math.random() * 100) + 1;
			totalAge += age;
			frogs[i] = new Frog(age);
		}
		
		//In the main calculate the average age of the frog
		int averageAge = (totalAge / frogs.length);
		
		
		//In the main display how many frogs were created
		System.out.println("frogs created: " + frogs.length);
		System.out.println("Average age of frogs: " + averageAge);
	
	}
}
