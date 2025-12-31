package Conditional_Statement;
import  java.util.*;

public class Calculator {
   public static void main(String args[]){
    System.out.println("1 -> + , 2 -> - , 3 -> * , 4 -> /");
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char operator = sc.next().charAt(0);

    switch(operator) {
        case '+' : System.out.println(a+b);
                       break;
        case '-' : System.out.println(a-b);
                       break;
        case '*' : System.out.println(a*b);
                       break;
        case '/' : System.out.println(a/b);
                       break;
        case '%' : System.out.println(a%b);
                       break;
        default: System.out.println("Inavlid Operator ") ;   
       }
       sc.close();
   } 
   
}
