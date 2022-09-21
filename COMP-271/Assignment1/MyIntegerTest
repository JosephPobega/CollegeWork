public class MyIntegerTest {
// Use this driver to test you class
  public static void main(String[] args) {
    MyInteger n1 = new MyInteger(5);
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));
    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));
    String s = "3539";
    System.out.println(MyInteger.parseInt(s));
    
    MyInteger n2 = new MyInteger(24);
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
  }
}

///////////////////////////////////////////////////////////////////
class MyInteger{
	// Design your class here
	
	private int intValue;
	public MyInteger(int value) {
		intValue = value;
	    }
	    public int getValue() {
	        return intValue;
	    }
	    public boolean isEven() {
	        return (intValue % 2) == 0;
	    }
	    public boolean isOdd() {
	        return (intValue % 2) == 1;
	    }
	    public boolean isPrime() {
	        if (intValue == 1 || intValue == 2) {
	            return true;
	        }
	        else {
	            for (int i = 2; i < intValue; i++) {
	                if (i % intValue == 0) return false;
	            }
	        }
	        return true;
	    }
	    public static boolean isEven(int intInt) {
	        return (intInt % 2) == 0;
	    }
	    public static boolean isOdd(int intInt) {
	        return (intInt % 2) == 1;
	    }
	    public static boolean isPrime(int intInt) {
	        if (intInt == 1 || intInt == 2) {
	            return true;
	        }
	        else {
	            for (int i = 2; i < intInt; i++) {
	                if (i % intInt == 0) return false;
	            }
	        }
	        return true;
	    }    
	    public static boolean isEven(MyInteger intInt) {
	        return intInt.isEven();
	    }
	    public static boolean isOdd(MyInteger intInt) {
	        return intInt.isOdd();
	    }
	    public static boolean isPrime(MyInteger intInt) {
	        return intInt.isPrime();
	    }
	    public boolean equals(int testInt) {
	        if (testInt == intValue) 
	            return true;
	        return false;
	    }
	    public boolean equals(MyInteger intInt) {
	        if (intInt.intValue == this.intValue) 
	            return true;
	        return false;
	    }
	    public static int parseInt(char[] values) {
	        int sum = 0;
	        for (char i : values) {
	            sum += Character.getNumericValue(i);
	        }
	        return sum;
	    }
	    public static int parseInt(String value) {
	        return Integer.parseInt(value);
	    }
	}

