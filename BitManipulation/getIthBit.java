package BitManipulation;

public class getIthBit {

    // Method to get ith bit
    public static int GetIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 10; // binary: 1010
        int i = 1;
        System.out.println(GetIthBit(n, i)); // Output: 1
    }
}
