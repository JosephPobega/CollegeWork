
public class Cat extends Animal{
	

	Cat(int weight){super(weight);}
	
	@Override
	public String says(){return "meow!";}

	
	public String toString() {
		return super.toString() + " Hello I am a Cat!";
	}
	
	
	@Override
	public int compareTo(Animal o) {
		return 0;
	}
}
