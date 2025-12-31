package BitManipulation;

public class oddOrEven{

    public static void odd_or_even(int n){
        int bitMask = 1;
        if((n & bitMask) ==0){
            //even number
            System.out.println("Even ");
        }else{
            System.out.println("Odd ");
        }

    }


    public static void main(String args[]){
        odd_or_even(10);
        odd_or_even(7);
        odd_or_even(5);
    }
}
