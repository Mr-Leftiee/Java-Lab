import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class exp12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Full-Time Employee details:");
        System.out.print("Name: ");
        String fullName = obj.nextLine();
        System.out.print("ID: ");
        int fullId = obj.nextInt();
        System.out.print("Monthly Salary: ");
        double monthlySalary = obj.nextDouble();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullName, fullId, monthlySalary);

        obj.nextLine();
        System.out.println("\nEnter Part-Time Employee details:");
        System.out.print("Name: ");
        String partName = obj.nextLine();
        System.out.print("ID: ");
        int partId = obj.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = obj.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = obj.nextInt();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partName, partId, hourlyRate, hoursWorked);

        System.out.println("\nFull-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());

        obj.close();
    }
}
