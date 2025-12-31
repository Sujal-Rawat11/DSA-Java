package Variable_and_Data_Types;

import java.util.*;
public class AOC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;

        System.out.println("Area of circle = " + area);
        sc.close();
    } 
}
