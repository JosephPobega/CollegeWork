import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class filereader{
	public void fileMethod() throws IOException{
	  ArrayList<String[]> data = new ArrayList<>();
	  try (BufferedReader br = new BufferedReader(new FileReader("CovidData.csv"))) {
	      String line;
	      while ((line = br.readLine()) != null){
	    	  String[] row = line.split(",");
	    	  data.add(row);
	      }
	  }
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("PRESS ANY BUTTON TO START");
			System.out.println("PRESS 0 TO EXIT");
			int column = scanner.nextInt();
			
			while(column != 0) {
				System.out.println("USMER: 1, MEDICAL_UNIT: 2, SEX: 3, PATIENT_TYPE: 4, DATE_DIED, 5");
				System.out.println("PRESS 0 TO EXIT");
				
				int column1 = scanner.nextInt();
				for (String[] row : data) {
					System.out.println(row[column1 - 1]);
				}
				for(String[] row : data) {
				System.out.println("\nNUMBER OF COLUMNS: " + row.length);
				System.out.println("TOTAL NUMBER OF DATA: " + data.size());
				System.out.println("");
				
				if (column1 == 3) {
					System.out.println("1 for male | 2 for female\n");
				}
				if (column1 == 5) {
					System.out.println("If date is 999-99-99, patient is still alive\n");
				}
				break;
				}
			}
	    }
	}
}

