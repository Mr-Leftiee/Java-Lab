import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class exp23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade (A-F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        try {
            if (grade < 'A' || grade > 'F') {
                throw new InvalidGradeException("Grade must be between A and F.");
            }
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        }

        scanner.close();
    }
}
