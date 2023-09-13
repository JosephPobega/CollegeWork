public class Student {
    private String firstName;
    private String lastName;
    private String favoriteSnack;
    private int credits;
    private double costBeverage;

    // Constructor that initializes instance variables
    public Student(String firstName, String lastName, String favoriteSnack, int credits, double costBeverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteSnack = favoriteSnack;
        this.credits = credits;
        this.costBeverage = costBeverage;
    }

    // Default constructor
    public Student() {
        // Initialize with default values
        this.firstName = "";
        this.lastName = "";
        this.favoriteSnack = "";
        this.credits = 0;
        this.costBeverage = 0.0;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavoriteSnack(String favoriteSnack) {
        this.favoriteSnack = favoriteSnack;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setCostBeverage(double costBeverage) {
        this.costBeverage = costBeverage;
    }

    @Override
    public String toString() {
        return "Student Info:\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Favorite Snack: " + favoriteSnack + "\n" +
                "Credits: " + credits + "\n" +
                "Cost of Beverage: $" + costBeverage;
    }
