import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PresidentsApp {
    public static void main(String[] args) {
        List<President> presidents = loadPresidents("data/presidents.csv");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'Number' (1-46) or a president's name to view details:");
            System.out.println("'Net' to view net worth");
            System.out.println("'Health' to check if a president is alive");
            System.out.println("'All' to view all presidents' details");
            System.out.println("'Quit' to exit");

            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Quit")) {
                System.out.println("Exiting the application.");
                break;
            } else if (userInput.equalsIgnoreCase("Net")) {
                presidents.sort((p1, p2) -> p1.getNetWorth().compareTo(p2.getNetWorth()));
                for (President president : presidents) {
                    System.out.println(president.getName() + " - Net Worth: " + president.getNetWorth());
                }
            } else if (userInput.equalsIgnoreCase("Health")) {
                for (President president : presidents) {
                    System.out.println(president.getName() + " - Alive: " + president.getHealth());
                }
            } else if (userInput.equalsIgnoreCase("All")) {
                for (President president : presidents) {
                    System.out.println(president.toString());
                }
            } else {
                President selectedPresident = null;
                for (President president : presidents) {
                    if (president.getName().equalsIgnoreCase(userInput) || String.valueOf(president.getNumber()).equals(userInput)) {
                        selectedPresident = president;
                        break;
                    }
                }
                if (selectedPresident != null) {
                    System.out.println("Number: " + selectedPresident.getNumber());
                    System.out.println("Name: " + selectedPresident.getName());
                    System.out.println("Birth: " + selectedPresident.getBirth());
                    System.out.println("Death: " + selectedPresident.getDeath());
                    System.out.println("Net Worth: " + selectedPresident.getNetWorth());
                    System.out.println("Alive: " + selectedPresident.getHealth());
                } else {
                    System.out.println("President not found. Enter 'Number' (1-46), 'Net', 'Health', 'All', or 'Quit'.");
                }
            }
        }

        scanner.close();
    }

    private static List<President> loadPresidents(String filename) {
        List<President> presidents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    int number = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String birth = parts[2];
                    String death = parts[6];
                    String netWorth = parts[5];
                    String health = parts[13].equals("(living)") ? "true" : "false";

                    President president = new President(number, name, birth, death, netWorth, health);
                    presidents.add(president);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return presidents;
    }
}

