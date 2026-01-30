package Recursion.PracticeQuestio;

public class practiceQuestion2 {

    static String arr[] ={"Zero","One","Two","Three", "Four", "Five" ,"Six", "Seven", "Eight", "Nine"};
    public static void print(int n){
        if(n==0){
            return;
        }

       int lastDigit = n%10;
       print(n/10);
       System.out.print(arr[lastDigit]+" ");
    }
    public static void main(String args[]){
       
        int n = 5456;
       
        print(n);

    }
}
