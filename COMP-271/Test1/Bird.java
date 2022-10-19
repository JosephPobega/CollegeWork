
public class Bird extends Animal{

	Bird(int weight){super(weight);}
	
	@Override
	public String says(){return "tweet!";}

	public String toString() {
		return super.toString() + " Hello I am a Bird!";
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
