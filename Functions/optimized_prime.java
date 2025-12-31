package Functions;

import java.util.*;

public class optimized_prime {
    public static boolean isPrime(int a){
        boolean isPrime = true;
        for(int i =2; i<=Math.sqrt(a);i++){
            if(a % i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("The given number is Prime ");
        }else{
            System.out.println("The given number is not Prime ");
        }
        sc.close();
    }
}
