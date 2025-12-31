package Conditional_Statement;
import java.util.*;

public class Pass_or_Fail {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float marks = sc.nextFloat();

        String result =  (marks>33) ? "Pass" : "Fail";
        System.out.println(result);
        sc.close();
    }
}
