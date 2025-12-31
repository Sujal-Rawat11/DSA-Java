package Functions;

public class Decimal_to_Binary {
    public static void decToBin(int n){
        int mynum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n % 2;
            binNum = binNum + (int)(rem * Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + mynum + " = " + binNum);
    }



    public static void main(String args[]){
        decToBin(12);
    }
}
