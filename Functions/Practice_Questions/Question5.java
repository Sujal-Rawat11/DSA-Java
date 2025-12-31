package Functions.Practice_Questions;
import java.util.*;

public class Question5 {
    public static int sumdigits(int n){
        int sum =0;
        int rem ;
        while(n!=0){
            rem = n%10;
            sum = sum + rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int result = sumdigits(n);

        System.out.println("The sum of digits is " + result);
        sc.close();

    }
}
