import java.util.Scanner;

class exp7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        int sum = 0, ori = n;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n = n / 10;
        }

        String res = (ori == sum) ? "is an Armstrong number" : "is not an Armstrong number";
        System.out.println(res);
        obj.close();
    }
}
