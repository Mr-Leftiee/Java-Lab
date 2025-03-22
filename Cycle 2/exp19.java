//.search for a pattern in a string and replace it with  another string 
import java.util.Scanner;

class exp19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String str = obj.nextLine();

        System.out.println("Enter the pattern to search:");
        String pattern = obj.nextLine();

        System.out.println("Enter the replacement string:");
        String replacement = obj.nextLine();

        String result = str.replace(pattern, replacement);

        System.out.println("Resulting string: " + result);

        obj.close();
    }
}
