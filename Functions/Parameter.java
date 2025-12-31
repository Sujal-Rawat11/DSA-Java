package Functions;
import java.util.*;

public class Parameter {
    public static void calculatesum(int a , int b){
        int sum = a + b;
        System.out.println("Sum is : " + sum );
        
    }
    public static void printHello(){
        System.out.println("Hello World ! ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);
        sc.close();
    }

}
