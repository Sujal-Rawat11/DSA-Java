package Functions;

public class Binary_to_Decimal {

    public static void binnToDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum= binNum / 10;
        }

        System.out.println("Decimal of "+mynum+" = "+ decNum);
    }
    public static void main(String args[]){
        binnToDec(101);
    }
}
