import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Triangle implements Shape {
    private double base, height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    private double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class exp20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        Shape shape1 = new Triangle(base, height);
        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape shape2 = new Rectangle(length, width);
        
        System.out.println("Triangle Area: " + shape1.calculateArea());
        System.out.println("Rectangle Area: " + shape2.calculateArea());
        
        scanner.close();
    }
}
