package lab4;

public class Plyer extends Tool{
	
	private char size;
	
	public Plyer() {
		super();
		size = ' ';
	}
	
	public Plyer(double price, char size){
		super(price);
		this.size = size;
	}
	
	public String toString() {
		return "This is a Plyer the is price is" + this.price +  " and the sizet is:" + this.size;
	}
	
	
}
