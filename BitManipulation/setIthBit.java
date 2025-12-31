package BitManipulation;

public class setIthBit {
    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String args[]){
        System.out.println(SetIthBit(10 , 3));
    }
}
