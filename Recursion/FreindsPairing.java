package Recursion;

public class FreindsPairing {
    public static int freindsPairing(int n ){
        //Base Case
        if(n == 1||n == 2){
            return n ;
        }
        //CHOICE

        //Single
        int fnm1 = freindsPairing(n-1);

        //Pair
        int fnm2 = freindsPairing(n-2);
        int pairWays = (n-1) * fnm2;
 
        //Total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(freindsPairing(3));
    }
}
