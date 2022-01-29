import java.util.Scanner;

public class main {
    private static float balance = 100;
    private static int anotherTransaction;
    public static void main(String args[]) {
    id();
    
    }
    public static void id(){
    Scanner input = new Scanner(System.in);
    int id = 1;
    int choice;
    System.out.println("Enter your ID: ");
    choice = input.nextInt();
    if(choice == id) {
    	transaction();
    }
    else {
    	System.out.println("Incorrect ID");
    	id();
    }
    }
    
    private static void transaction() {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Please select an option");
        System.out.println("1: Withdraw");
        System.out.println("2: Deposit");
        System.out.println("3: Balance");
        System.out.println("4: Exit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                float amount;
                System.out.println("Please enter amount to withdraw: ");
                amount = input.nextFloat();
                if (amount > balance || amount == 0) {
                    System.out.println("You have insufficient funds");
                    anotherTransaction();
                } else {
                    balance = balance - amount;
                    System.out.println("withdrawn: " + amount + " New balance: " + balance);
                    anotherTransaction();
                }
                break;
            case 2:
                float deposit;
                System.out.println(" enter amount to deposit: ");
                deposit = input.nextFloat();
                balance = deposit + balance;
                System.out.println("You have deposited " + deposit + " new balance is " + balance);
                anotherTransaction();
                break;
            case 3:
                System.out.println("Your balance is " + balance);
                anotherTransaction();
                break;
            default:
                System.out.println("Wrong option:");
                anotherTransaction();
                break;
        }
    }
    private static void anotherTransaction() {
    	Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to exit");
        anotherTransaction = input.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else {
            System.out.println("Wrong choice");
            anotherTransaction();
        }
    }
}
