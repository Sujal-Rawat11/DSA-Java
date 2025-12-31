package Functions;
import java.util.*;

public class binomial_coefficient {

    public static int fact(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact *= i;
        }
        return fact;
    }

    public static int bincoe(int n, int r){

        int nume = fact(n);
        int denome = fact(n-r) * fact(r);
        return nume/denome;

    }
    public static void main(String args[]){
        System.out.println("Enter the n and r : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int result = bincoe(n,r);
        System.out.println("The binomial coefficient is : " + result);

        sc.close(); 
    }
}
 