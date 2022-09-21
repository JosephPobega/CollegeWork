package lab2;

public class Frog {
	private int age;
	
	//Create a static variable that counts how many frogs are created
	private static int numFrogs;
	
	//Create a default constructor that sets the frog age to zero
	public Frog() {
		this(0);
	}

	//Create a one argument constructor that sets the frogs age
	public Frog(int age) {
		setAge(age);
		this.age = age;
		numFrogs++;
	}

	//create getter and setters
	public void setAge(int age) {this.age = age;}
	public int getAge() {return this.age;}

	//Create a static method that displays the number of frogs created
	public static int getNumFrogs() {return numFrogs;}


}
