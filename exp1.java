//1) Write a program to find the area and perimeter of a circle.
import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the radius : ");
        double r = obj.nextDouble();
        double cArea = Math.PI * r * r;
        double cPeri = 2 * Math.PI * r;
        System.out.println("Circle Area: " + cArea);
        System.out.println("Circle Perimeter: " + cPeri);
        
        obj.close();
    }
}