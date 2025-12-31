package ARRAYS.Part1;

public class Largest_number {
    public static int  Largest_numb(int arr[]){
        int max = Integer.MIN_VALUE;
    

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }



    public static void main(String args[]){
        int marks[] = {1, 99, 45, 98, 56};
        System.out.println("The largest number in the array is : " + Largest_numb(marks));

    }
}
