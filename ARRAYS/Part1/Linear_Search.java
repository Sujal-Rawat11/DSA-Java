package ARRAYS.Part1;

public class Linear_Search {
    public static int linear_Search(int numbers[], int key){
        for(int i =0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,10, 12, 14, 16};
        int key = 10;

        int index = linear_Search(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : " + index);
        }
    }
        
}
