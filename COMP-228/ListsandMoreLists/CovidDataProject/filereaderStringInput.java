import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class filereaderStringInput{
	public void fileMethod() throws IOException{
	  ArrayList<String[]> data = new ArrayList<>();
	  try (BufferedReader br = new BufferedReader(new FileReader("src//CovidData.csv"))) {
	      String line;
	      while ((line = br.readLine()) != null){
	    	  String[] row = line.split(",");
	    	  data.add(row);
	      }
	  } 
	  catch (IOException e) {
		  e.printStackTrace();
	  }
	  System.out.println("Data is sucessfully loaded.");
	  
	  try (Scanner input = new Scanner(System.in)) {
		while(true) {
			  System.out.println("\n'all' to load all data");
			  System.out.println("'gender' to load sex all types");
			  System.out.println("'died' to load death dates");
			  System.out.println("'info' to load info on data");
			  System.out.println("'exit' to teminate");
			  
			  String question = input.nextLine();
			  
			  if(question.equalsIgnoreCase("all")) {
				  for (String[] row : data) {
		              System.out.println(String.join(", ", row));
		          }
				  System.out.println("Total: " + data);
			  }
			  else if(question.equals("gender")) {
				  for (String[] row : data) {
					  System.out.println(row[2]);
				  }
				  System.out.println("1 for male | 2 for female\n");
			  }
			  else if(question.equals("died")) {
				  for(String[] row : data) {
				  System.out.println(row[4]);
				  }
				  System.out.println("If date is 999-99-99, patient is still alive\n");
			  }
			  else if(question.equals("info")) {
				  System.out.println("Amount of data: " + data.size());
			  }
			  else if (question.equals("exit")) {
				  System.out.println("Program terminated.");
				  break;
			  }
		  }
	}
	}
}
