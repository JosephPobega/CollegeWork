package practice1;

public class Main {

	public static void main(String[] args) {
		
		Student Joseph = new Student("Joseph", "Pobega", "Popcorn", 9, 1);

		System.out.println(Joseph);
		
		System.out.println("First Name:      " + Joseph.getFirstName());
		System.out.println("Last Name:       " + Joseph.getLastName());
		System.out.println("Favorite Snack:  " + Joseph.getfavSnack());
		System.out.println("Credits:         " + Joseph.getCredits());
		System.out.println("Cost Be:varage:  " + Joseph.getBev());
		
		
	}

}
