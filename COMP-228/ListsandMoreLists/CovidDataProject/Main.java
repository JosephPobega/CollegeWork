import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    ArrayList<String[]> data = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("src\\CovidData.csv"))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] row = line.split(",");
        data.add(row);
      }
    }
   
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("USMER: 1, MEDICAL_UNIT: 2, SEX: 3, PATIENT_TYPE: 4, DATE_DIED, 5");
		System.out.println("PRESS 0 TO EXIT");
		int column = scanner.nextInt();
		while(column != 0) {
			System.out.println("USMER: 1, MEDICAL_UNIT: 2, SEX: 3, PATIENT_TYPE: 4, DATE_DIED, 5");
			System.out.println("PRESS 0 TO EXIT");
			int column1 = scanner.nextInt();
		for (String[] row : data) {
		  System.out.println(row[column1 - 1]);
		}
  }
	}
    }
}
