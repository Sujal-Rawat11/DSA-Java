package BitManipulation;

public class update{

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0 ){
            return clearIthBit(n , i);
        }else{
            return setIthBit(n, i);
        }

        // Step 1: clear ith bit
        // n = clearIthBit(n, i);

        // Step 2: set ith bit according to newBit
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 1, 1)); // example
    }
}
