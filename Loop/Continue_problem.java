package Loop;

import java.util.*;

public class Continue_problem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your Number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                System.out.println("Skipped");
                continue;
            }

            System.out.println("number was : " + n);
            sc.close();

        } while (true);

        

    }
    
}
