package lab4;

public class Hammer extends Tool{

	private int weight;
	
	public Hammer(){super(); weight = 0;}
	
	public Hammer(double price, int weight) {
		super(price); 
		this.weight = weight;
	}

	public String toString() {
		return "This is a Hammer the is price is" + this.price + "and the weight is:" + this.weight;
	}
}
