package Recursion;

public class sumOfN {
    public static int sum(int n){
        int sum = 0;
        if(n == 1){
            return sum;
        }
        return n + sum(n-1);

    }
    public static void main(){
        int n = 6;
        System.out.println("The sum of n number is : " + sum(n));
    }
}
