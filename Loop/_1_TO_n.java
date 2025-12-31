package Loop;
import java.util.*;

public class _1_TO_n {
    public static void main(String args[]){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
    


}
