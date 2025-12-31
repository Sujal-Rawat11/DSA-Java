package Functions.Practice_Questions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Math.min()
        double min = Math.min(a, b);
        System.out.println("Minimum value: " + min);

        // Math.max()
        double max = Math.max(a, b);
        System.out.println("Maximum value: " + max);

        // Math.sqrt()
        System.out.println("Square root of first number: " + Math.sqrt(a));

        // Math.pow()
        System.out.println("First number raised to power 2: " + Math.pow(a, 2));

        // Average (Math.avg does NOT exist, calculated manually)
        double avg = (a + b) / 2;
        System.out.println("Average of two numbers: " + avg);

        // Math.abs()
        System.out.println("Absolute value of first number: " + Math.abs(a));

        sc.close();
    }
}
