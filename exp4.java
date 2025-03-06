import java.util.Scanner;
class exp4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Select your role \n 1.Manager \n 2.Developer \n 3.Intern ");
        System.out.print("Enter your choice: ");
        int c = obj.nextInt();
        
        int sal = 0;

        switch (c) {
            case 1:
                sal = 50000;
                break;
            case 2:
                sal = 30000;
                break;
            case 3:
                sal = 15000;
                break;
            default:
                System.out.println("Invalid Choice");
                obj.close();
                return;
        }

        System.out.print("Enter the Experience: ");
        int e = obj.nextInt();

        double b = (e >= 3 && e <= 5) ? 0.10 : (e > 5 ? 0.20 : 0.0);
        double T = sal + (sal * b);

        System.out.println("Total Salary: " + T);

        obj.close();
    }
}
