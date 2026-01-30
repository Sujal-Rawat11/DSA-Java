package Recursion;

public class TillingProblem {
    public static int tilling(int n){ // 2 X n (Floor Size)
        //base case
        if(n == 0|| n == 1){
            return 1;
        }
        //process
        //vertical choice
        int verticalTiles = tilling(n-1);

        //horizontal choice
        int horizontalTiles = tilling(n-2);

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(tilling(5));
    }
}
