
public abstract class Animal implements Comparable<Animal>{
	private int weight;
	private static int count;
	
	Animal() {this(0);}
	
	Animal(int weight){
		this.weight = weight;
		count++;
	}
	
	public int getWeight() {return this.weight;}
	public static int getCount() {return count;}
	
	
	public int compareTo(Animal arg0) {
		if(this.getWeight() < arg0.getWeight()) {return -1;}
		if(this.getWeight() > arg0.getWeight()) {return 1;}
		else{return 0;}
	}
	
	@Override
	public String toString(){
		return "weight is " + getWeight();}
		
		public abstract String says();
	
	
	
	
	
}
