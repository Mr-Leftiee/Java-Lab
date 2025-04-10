import java.util.Scanner;

public class exp22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = obj.nextLine();

        try {
            validate(phone);
            System.out.println("Phone number is valid.");
        } catch (Exception e) {
            System.out.println("Invalid phone number: " + e.getMessage());
        }

        obj.close();
    }

    public static void validate(String phone) throws Exception {
        if (!phone.matches("\\d{10}")) {
            throw new Exception("Phone number must contain exactly 10 digits.");
        }
    }
}
