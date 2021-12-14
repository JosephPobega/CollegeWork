import java.util.Scanner;
import java.util.GregorianCalendar;
public class hw {

	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		System.out.println(("Current month is: " + calender.get(calender.MONTH)));
		System.out.println("Current day is: " + calender.get(calender.DAY_OF_MONTH));
		System.out.println("Current year is: " + calender.get(calender.YEAR));
		
		System.out.println("------------------");
		
		calender.setTimeInMillis(1234567898765L);
			System.out.println(calender.get(calender.MONTH));
			System.out.println(calender.get(calender.DAY_OF_MONTH));
			System.out.println(calender.get(calender.YEAR));
	}

}
