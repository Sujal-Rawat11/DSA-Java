package Sorting;
import java.util.*;

public class Inbuilt_Sort {
    public static void main(String args[]){
        int arr[] = { 5, 4, 3, 2, 1};
        Arrays.sort(arr,0,3);
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int compare(int a , int b){
        // a , b -ve
        // a == b 0
        // a > b +ve
        return a-b;
    }
}
