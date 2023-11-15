package code.codeWithHarry.lecPracs.Ch1_basic1;
import java.util.Scanner;
public class Lec5_practice_Programs /*extends sumofThreeNumbers*/{
    //This demonstrates the maximum numbers of OOP concepts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding 3 numbers
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int num3 = scanner.nextInt();
        Calculator calculator = new Calculator(num1, num2, num3); // Object creation using constructor
        int sum = calculator.calculateSum(); // Method invocation
        System.out.println("Sum of the numbers: " + sum);

        // Calculating CGPA
        System.out.print("Enter marks for three subjects (out of 100): ");
        double marks1 = scanner.nextDouble();
        double marks2 = scanner.nextDouble();
        double marks3 = scanner.nextDouble();
        CGPACalculator cgpaCalculator = new CGPACalculator(marks1, marks2, marks3); // Object creation using constructor
        double cgpa = cgpaCalculator.calculateCGPA(); // Method invocation
        System.out.println("CGPA: " + cgpa);

        // Converting kilometers to miles
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        DistanceConverter distanceConverter = new DistanceConverter(kilometers); // Object creation using constructor
        double miles = distanceConverter.convertKilometersToMiles(); // Method invocation
        System.out.println("Distance in miles: " + miles);

        // Detecting whether a number is an integer
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        NumberDetector numberDetector = new NumberDetector(number); // Object creation using constructor
        boolean isInteger = numberDetector.isNumberInteger(); // Method invocation
        System.out.println("Is the number an integer? " + isInteger);

        scanner.close();
    }
}

class Calculator {
    private int num1;
    private int num2;
    private int num3;

    public Calculator(int num1, int num2, int num3) { // Constructor
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int calculateSum() { // Method
        return num1 + num2 + num3;
    }
}

class CGPACalculator {
    private double marks1;
    private double marks2;
    private double marks3;
    private static double TOTAL_MARKS = 300.0;

    public CGPACalculator(double marks1, double marks2, double marks3) { // Constructor
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateCGPA() { // Method
        return (marks1 + marks2 + marks3) / TOTAL_MARKS * 4.0;
    }
}

class DistanceConverter {
    private double kilometers;
    private static double MILES_CONVERSION_FACTOR = 0.6213712;
    /*
     The reason for declaring it as static is to indicate that the variable belongs to the class itself
     rather than an instance of the class. When a variable is declared as static, it means there is only
     one copy of that variable shared among all instances of the class.
    */

    public DistanceConverter(double kilometers) { // Constructor
        this.kilometers = kilometers;
    }

    public double convertKilometersToMiles() { // Method
        return kilometers * MILES_CONVERSION_FACTOR;
    }
}

class NumberDetector {
    private double number;

    public NumberDetector(double number) { // Constructor
        this.number = number;
    }

    public boolean isNumberInteger() { // Method
        return number % 1 == 0;
    }
}
