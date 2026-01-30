package Recursion;

public class Factorial {
    
    public static int fact(int n){
        if(n == 0 || n == 1){
            //Base class
            return 1;
        }
        int fact = 1;
        fact = n * fact(n-1);
        return fact;
    }


    public static void main(String args[]){
        int n = 5;
        System.out.println("Factorial = " + fact(n));
    }
}
   