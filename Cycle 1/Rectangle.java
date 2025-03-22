//Create different rectangles and print their area and perimeter.
import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double Area() {
        return length * width;
    }

    double Perimeter() {
        return 2 * (length + width);
    }

    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Constructor):");
        rect1.displayDetails();

        System.out.print("Enter length for Rectangle 2: ");
        double length = sc.nextDouble();

        System.out.print("Enter width for Rectangle 2: ");
        double width = sc.nextDouble();

        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("Rectangle 2 (Parameterized Constructor):");
        rect2.displayDetails();

        sc.close();
    }
}
