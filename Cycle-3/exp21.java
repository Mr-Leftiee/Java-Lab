import java.util.Scanner;

public class exp21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            validate(password);
            System.out.println("Password is valid.");
        } catch (Exception e) {
            System.out.println("Invalid password: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validate(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new Exception("Password must contain at least one number.");
        }

        if (!password.matches(".*[\\$#&].*")) {
            throw new Exception("Password must contain at least one special character ($, #, &).");
        }
    }
}
