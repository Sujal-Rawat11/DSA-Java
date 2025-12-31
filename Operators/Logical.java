package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a & b);   // bitwise AND
        System.out.println(a | b);   // bitwise OR

        boolean c = true;
        System.out.println(!c);      // logical NOT
    }
}
