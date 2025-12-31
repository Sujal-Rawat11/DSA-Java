package Functions;
import java.util.*;

public class Factorial {

    public static int factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        System.out.print("Enter number for factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial of "+n+" is : " +fact);
        sc.close();
        
    }
}
