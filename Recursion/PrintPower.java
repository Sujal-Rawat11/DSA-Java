package Recursion;

public class PrintPower {
    public static int power(int a , int n){
        if(n == 0){
            return 1;
        }

        int halfPowerSq =  power(a, n/2) * power(a, n/2);

        //n is odd
        if(n%2!=0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x * pow(x, n-1);
    }


    public static void main(String args[]){
        System.out.println(pow(2,5));
        System.out.println(power(2, 5));
    }
}
