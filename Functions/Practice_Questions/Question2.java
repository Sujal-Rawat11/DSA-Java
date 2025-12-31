package Functions.Practice_Questions;
import java.util.*;

public class Question2 {

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to test : ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("The number is even ");
        }else{
            System.out.println("The number is odd ");
        }
        sc.close();
    }
}
