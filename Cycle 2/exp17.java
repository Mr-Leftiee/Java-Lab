//Count the number of vowels and consonants in a line of text. 
import java.util.Scanner;

class exp17 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = obj.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        obj.close();
    }
}
