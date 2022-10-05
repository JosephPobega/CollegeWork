package lab4;

public class Tool {

	protected double price;
	
	public Tool() {this(0);}
	
	public Tool(double price) {this.price = price;}
	
	public boolean equals(Object o) {
		if (o instanceof Tool) {return this.price == ((Tool)o).price;}
		return false;
	}
	
}