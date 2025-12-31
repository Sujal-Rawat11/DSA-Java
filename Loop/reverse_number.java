package Loop;
import java.util.*;

public class reverse_number {
    public static void main(String args[]){
        System.out.print("Enter your number : " );
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;

    while(n > 0){
        int lastdig = n%10;
        rev = (rev*10) + lastdig;
        n = n/10;
    }

    System.out.println(rev);
    sc.close();
    }
}
