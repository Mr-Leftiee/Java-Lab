//Create multiple students and check their pass status. 
import java.util.Scanner;

class Student {
    int studentId;
    String name;
    double marks;

    Student(int id, String n, double m) {
        studentId = id;
        name = n;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (isPassed() ? "Passed" : "Failed"));
    }

    boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

        sc.close();
    }
}
