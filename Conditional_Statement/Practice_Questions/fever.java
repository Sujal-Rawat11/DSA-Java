import java.util.*;

public class fever {
  public static void main(String args[]){
    System.out.print("Enter your temprature : ");
    Scanner sc = new Scanner (System.in);
    float temp = sc.nextFloat();
    if(temp>100){
        System.out.println("You have fever : ");
    }else{
        System.out.println("You do not have any fever : ");
    }
    sc.close();
  }  
}
