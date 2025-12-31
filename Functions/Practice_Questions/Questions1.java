package Functions.Practice_Questions;
import java.util.*;

public class Questions1 {
    public static int avg(int a , int b , int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = avg(a,b,c);

        System.out.println("The avgerage of the numbers is " + average);
        sc.close();
    }
}
