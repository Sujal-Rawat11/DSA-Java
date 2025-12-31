package Conditional_Statement;

public class Ternary_operator {
    public static void main(String args[]){
        int number = 4;
        //ternary operator
        String type = ((number%2)==0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
