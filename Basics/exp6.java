// Write a program to check if a number is a palindrome. 
import java.util.Scanner;
class exp6 {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = obj.nextInt();
        int rev =0 ;
         int ori=n;
        while (n>0) {
            
            rev=rev*10 + n%10;
            n=n/10;
        }
        String res = (ori == rev) ? "is palindrome" :"is not palindrome";
        System.out.println(res);
    obj.close();
    }
}
