import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Course course = new Course("Class:");
        for (int i = 0; i < 20; i++) {
            course.addStudent("Student" +(i + 1));
        }
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("students: " + course.getNumberOfStudents());
        System.out.println("Students dropped:");
        course.dropStudent("Student " + 1);
        course.dropStudent("Student " + 8);
        System.out.println("Student 8 dropped.");
        System.out.println("Student 1 dropped.");
        System.out.println("Students: " + course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s", students[i]);
        }
        System.out.println("Number of students:" + course.getNumberOfStudents());
	}

}
