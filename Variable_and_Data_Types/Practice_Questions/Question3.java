package Variable_and_Data_Types.Practice_Questions;

import java.util.*;

public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil +eraser;
        float gst = (total*18)/100;
        float bill = total + gst;

        System.out.println("The Total Bill is : " + bill);
        sc.close();
    }
}
