//Sort an array of strings. 
import java.util.Scanner;
import java.util.Arrays;

class exp16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = obj.nextInt();
        obj.nextLine(); 

        String[] arr = new String[n];
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLine();
        }

        Arrays.sort(arr);

        System.out.println("Sorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        obj.close();
    }
}
