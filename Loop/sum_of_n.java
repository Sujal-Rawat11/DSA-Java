package Loop;
import java.util.*;

public class sum_of_n {
    public static void main(String args[]){
        System.out.print("Enter the numbber : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0,sum = 0;
        while(i<n){
            i++;
            sum += i;
        }

        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
