public class testProgram {

    public static void main(String[] args) {
        // Create the first Student object using the constructor
        Student student1 = new Student("John", "Doe", "Popcorn", 15, 2.50);

        // Create the second Student object using the default constructor and setter methods
        Student student2 = new Student();
        student2.setFirstName("Alice");
        student2.setLastName("Smith");
        student2.setFavoriteSnack("Chocolate");
        student2.setCredits(12);
        student2.setCostBeverage(3.00);

        // Print the information for both students
        System.out.println(student1);
        System.out.println("\n");
        System.out.println(student2);
    }
}
    
}
