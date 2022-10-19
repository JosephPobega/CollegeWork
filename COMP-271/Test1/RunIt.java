
public class RunIt {

	
	public static void main(String[] args) {
		
		Animal[] bunchOfAnimals = {
								new Bird(4),
								new Cat(3),
								new Dog(5),
								new Bird(2),
								new Cat(8),
								new Dog(6)
								};
		
		System.out.println("Total objects created: " + Animal.getCount()+ "\n");
		
		System.out.println("********* Animals Using Polymorphism ************");
		for(int i = 0; i < bunchOfAnimals.length; ++i)
		displayAnimals(bunchOfAnimals[i]);
		
		
		System.out.println("\n********* Animals Sorted Using Polymorphism ************");
		java.util.Arrays.sort(bunchOfAnimals);
		for(int i = 0; i < bunchOfAnimals.length; ++i)
			displayAnimals(bunchOfAnimals[i]);
		
		
	}
	
	public static void displayAnimals(Animal animal){
		System.out.println(animal + " and I say " + animal.says());
	}
	

}
