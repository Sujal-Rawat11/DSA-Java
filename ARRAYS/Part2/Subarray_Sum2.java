package ARRAYS.Part2;

// Prefix Sum
public class Subarray_Sum2 {

    public static void Subarray_sum(int arr[]) {

        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        int currsum = 0;

        // build prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // calculate all subarray sums
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("The max sum is : " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        Subarray_sum(numbers);
    }
}
