package ARRAYS.Part1;

public class subarray {

    public static void Subarray(int arr[]) {

        int ts=0;
        for (int i = 0; i < arr.length; i++) {

            int start = i;   // ✅ index, not value

            for (int j = i; j < arr.length; j++) {

                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                ts++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        Subarray(numbers);
    }
}
