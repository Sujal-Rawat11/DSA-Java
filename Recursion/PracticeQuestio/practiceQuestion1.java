package Recursion.PracticeQuestio;

public class practiceQuestion1 {
    public static void indarr(int arr[], int i, int key){
        if(i==arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }
        indarr(arr, i+1,key);
    }

    public static void main(String args[]){
        int arr[] ={1,2,4,4,5,6,4,6,4};
        indarr(arr,0,4);
    }
}
