import java.util.Scanner;

class exp5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Grade: ");
        String g = obj.nextLine();

        if (g.equals("A")) {
            System.out.println("Excellent work!");
        } else if (g.equals("B")) {
            System.out.println("Good job!");
        } else if (g.equals("C")) {
            System.out.println("You can do better");
        } else if (g.equals("D")) {
            System.out.println("Work harder");
        } else {
            System.out.println("Failed. Try again");
        }

        obj.close();
    }
}
