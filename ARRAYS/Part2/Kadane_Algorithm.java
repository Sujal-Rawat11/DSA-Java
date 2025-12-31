package ARRAYS.Part2;

public class Kadane_Algorithm {

    public static void kadane(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            cs += arr[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
            maxElement = Math.max(maxElement, arr[i]);
        }

        // Special case: all numbers are negative
        if (ms == 0) {
            ms = maxElement;
        }

        System.out.println("Our max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);

        int allNegative[] = {-2, -3, -1, -5};
        kadane(allNegative);
    }
}
