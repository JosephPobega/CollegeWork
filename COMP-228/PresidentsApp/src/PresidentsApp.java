import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class PresidentsApp {
    public static void main(String[] args) {
        ArrayList<President> presidentsDatabase = new ArrayList<>();
        loadDataset("presidents.csv", presidentsDatabase);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1 - View by Number");
            System.out.println("2 - View by Name");
            System.out.println("3 - View Health");
            System.out.println("4 - View by Net Worth");
            System.out.println("5 - View All");
            System.out.println("6 - Quit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a president's number (1-46): ");
                    int presidentNumber = scanner.nextInt();
                    displayByNumber(presidentNumber, presidentsDatabase);
                    break;
                    
                case 2:
                    System.out.print("Enter a president's name: ");
                    String presidentName = scanner.nextLine();
                    displayByName(presidentName, presidentsDatabase);
                    break;
     
                case 3:
                    System.out.print("Enter a president's name for health check: ");
                    String presidentForHealth = scanner.nextLine();
                    checkHealth(presidentForHealth, presidentsDatabase);
                    break;
                    
                case 4:
                    displayByNetWorth(presidentsDatabase);
                    break;
                    
                case 5:
                    displayAll(presidentsDatabase);
                    break;
                    
                    
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    // Load data from CSV file into the ArrayList
    private static void loadDataset(String fileName, List<President> presidentsDatabase) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String birthDate = data[1];
                String deathDate = data[2];
                String politicalParty = data[3];
                double netWorth = Double.parseDouble(data[8]);
                presidentsDatabase.add(new President(name, birthDate, deathDate, politicalParty, netWorth));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 // Modify displayByNumber to display the entire record
    private static void displayByNumber(int number, List<President> presidentsDatabase) {
        if (number >= 1 && number <= presidentsDatabase.size()) {
            President president = presidentsDatabase.get(number - 1);
            System.out.println("President " + number + " - " + president.getName() + ", " +
                    president.getBirthDate() + " - " + president.getDeathDate());
            // Print the entire record
            printPresidentRecord(president);
        } else {
            System.out.println("Invalid president number.");
        }
    }

    // Modify displayByName to display the entire record
    private static void displayByName(String name, List<President> presidentsDatabase) {
        for (President president : presidentsDatabase) {
            if (president.getName().equalsIgnoreCase(name)) {
                System.out.println("President: " + president.getName());
                System.out.println("Birth Date: " + president.getBirthDate());
                System.out.println("Death Date: " + president.getDeathDate());
                System.out.println("Political Party: " + president.getPoliticalParty());
                System.out.println("Net Worth: $" + president.getNetWorth());
                // Print the entire record
                printPresidentRecord(president);
                return;
            }
        }
        System.out.println("President not found.");
    }

    // Function to print the entire record for a president
    private static void printPresidentRecord(President president) {
        System.out.println("Entire Record:");
        System.out.println("President: " + president.getName());
        System.out.println("Birth Date: " + president.getBirthDate());
        System.out.println("Death Date: " + president.getDeathDate());
        System.out.println("Political Party: " + president.getPoliticalParty());
        System.out.println("Net Worth: $" + president.getNetWorth());
        System.out.println("-----------------------");
    }


    // View by Net Worth
    private static void displayByNetWorth(List<President> presidentsDatabase) {
        Collections.sort(presidentsDatabase, Comparator.comparingDouble(President::getNetWorth));
        System.out.println("Presidents sorted by Net Worth:");
        for (President president : presidentsDatabase) {
            System.out.println(president.getName() + " - $" + president.getNetWorth());
        }
    }

    // View Health
    private static void checkHealth(String name, List<President> presidentsDatabase) {
        for (President president : presidentsDatabase) {
            if (president.getName().equalsIgnoreCase(name)) {
                if (president.getDeathDate().equalsIgnoreCase("N/A")) {
                    System.out.println(president.getName() + " is alive.");
                } else {
                    System.out.println(president.getName() + " is deceased.");
                }
                return;
            }
        }
        System.out.println("President not found.");
    }

    // View All
    private static void displayAll(List<President> presidentsDatabase) {
        for (President president : presidentsDatabase) {
            System.out.println("President: " + president.getName());
            System.out.println("Birth Date: " + president.getBirthDate());
            System.out.println("Death Date: " + president.getDeathDate());
            System.out.println("Political Party: " + president.getPoliticalParty());
            System.out.println("Net Worth: $" + president.getNetWorth());
            System.out.println("-----------------------");
        }
    }
}
