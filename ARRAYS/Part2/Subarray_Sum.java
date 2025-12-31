package ARRAYS.Part2;

public class Subarray_Sum {
    public static void Subarray_sum(int arr[]) {
        int currsum ;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int start = i; // ✅ index, not value

            for (int j = i; j < arr.length; j++) {

                int end = j;
                currsum =0;

                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currsum += arr[k];
                }
                System.out.print(currsum + " ");
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum is : "+ maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        Subarray_sum(numbers);
    }
}
