package Conditional_Statement;
import java.util.*;

public class Largest_of_3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A >= B && A >= C){
            System.out.println("The largest of 3 is " + A);
        }else if(B>=A && B>=C){
            System.out.println("The largest of 3 is " + B);
        }else{
            System.out.println("The largest of 3 is " + C);
        }
        sc.close();

    }
}
