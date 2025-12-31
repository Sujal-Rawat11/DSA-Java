package Conditional_Statement;

public class if_else {
    public static void main(String args[]){
        int age = 23;
        if(age >= 18){
            System.out.println("Adult : Drive, vote");
        }
        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
