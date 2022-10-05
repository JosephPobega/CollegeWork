package lab4;

public class ToolDriver {
public static void main(String[] args) {
	// Polymorphism with Dynamic Binding
	Tool[] tools = new Tool[2];
	tools[0] = new Hammer(5.50, 7);
	tools[1] = new Plyer(4.00, 'M');
	System.out.println(tools[0]);
	System.out.println(tools[1]);
	//Output should be
	//This is a Hammer the price is 5.5 and the weight is: 7
	//This is a Plyer the price is 4.0 and the size is: M
	Object[] tool = new Tool[2];
	tool[0] = new Hammer(22.50, 12);
	tool[1] = new Plyer(14.00, 'L');
	System.out.println();
	System.out.println(getIt(tool[0]));
	System.out.println(getIt(tool[1]));
	//Output should be
	//This is a Hammer the price is 22.5 and the weight is: 12
	// This is a Plyer the price is 14.0 and the size is: L
	System.out.println();
	System.out.println(tool[0].equals(tool[1]));
	//Output:
	//false
	}
	public static String getIt(Object o){
	if (o instanceof Hammer){
	return ((Hammer)o).toString();
	}
	else if(o instanceof Plyer){
	return ((Plyer)o).toString();
	}
	else
	return "Error";
	}
}