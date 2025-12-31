package Sorting;

public class Bubble_sort {

    public static void bubblesort(int arr[]){
        for(int turns=0; turns<arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }
}


/*

public static void bubbleSort(int arr[]) {
    int n = arr.length;

    for (int turns = 0; turns < n - 1; turns++) {
        boolean swapped = false;

        for (int j = 0; j < n - 1 - turns; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
            }
        }

        // if no swaps happened, array is already sorted
        if (!swapped) {
            break;
        }
    }
}

*/