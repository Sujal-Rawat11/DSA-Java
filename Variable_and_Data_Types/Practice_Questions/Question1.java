package Variable_and_Data_Types.Practice_Questions;

import java.util.*;
public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        float average = (a+b+c)/3f;
        System.out.println("Average = " + average);
        sc.close();

    }
}
