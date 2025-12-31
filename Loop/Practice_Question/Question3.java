package Loop.Practice_Question;

import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        System.out.print("Enter the number for factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Fact = 1;
        for (int i = 1; i <= n; i++) {
            Fact *= i;
        }
        System.out.println("The factorial of n is : " + Fact);

        sc.close();
    }
}
