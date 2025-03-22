//write a program to find eligibility of a student
import java.util.Scanner;

class exp3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks for Maths:");
        int m1 = obj.nextInt();
        System.out.println("Enter the marks for Physics:");
        int m2 = obj.nextInt();
        System.out.println("Enter the marks for Chemistry:");
        int m3 = obj.nextInt();

        int total = m1 + m2 + m3;
        int mpTotal = m1 + m2;
        if ((m1 >= 60 && m2 >= 50 && m3 >= 40 && total >= 200) || mpTotal >= 150) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        obj.close();
    }
}
