package Functions;

public class Overloading1 {

    // function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of 4 numbers
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        int result1 = sum(10, 20);          // calls sum(int, int)
        int result2 = sum(1, 2, 3, 4);       // calls sum(int, int, int, int)

        System.out.println("Sum of 2 numbers: " + result1);
        System.out.println("Sum of 4 numbers: " + result2);
    }
}
