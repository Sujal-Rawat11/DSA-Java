package OOPS.Practice_Questions;
import java.util.*;

class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    void add(Complex c) {
        int r = this.real + c.real;
        int i = this.imag + c.imag;
        System.out.println("Sum = " + r + " + " + i + "i");
    }

    // Method to subtract two complex numbers
    void subtract(Complex c) {
        int r = this.real - c.real;
        int i = this.imag - c.imag;
        System.out.println("Difference = " + r + " + " + i + "i");
    }

    // Method to multiply two complex numbers
    void multiply(Complex c) {
        int r = (this.real * c.real) - (this.imag * c.imag);
        int i = (this.real * c.imag) + (this.imag * c.real);
        System.out.println("Product = " + r + " + " + i + "i");
    }
}

public class Practice_Question7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First complex number
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();

        // Second complex number
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);

        sc.close();
    }
}
