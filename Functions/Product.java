package Functions;
import java.util.*;

public class Product {

    public static int multiply(int a, int b){
        int p = a*b;
        return p;
    }
    public static void main(String args[]){
        System.out.println("Enter your numbers for products: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = multiply(a,b);
        System.out.println("The product is : " + product);
        sc.close();
    }
}
