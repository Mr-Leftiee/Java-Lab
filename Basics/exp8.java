// Print the Fibonacci sequence up to a given limit. 
import java.util.Scanner;

class exp8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = obj.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b + " ");
        
        int next = a + b;
        while (next <= limit) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
        
        obj.close();
    }
}
