public class Dog extends Animal{

	Dog(int weight){super(weight);}
	
	@Override
	public String says() {return "Woof!";}

	public String toString() {
		return super.toString() + " Hello I am a Dog!";
	}
	
	
	@Override
	public int compareTo(Animal o) {
		return 0;
	}
}
