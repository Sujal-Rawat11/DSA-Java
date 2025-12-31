package Functions;

public class overloading2 {

    public static int sum(int a , int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
        int intsum = sum(1,2);
        float floatsum = sum(1.6f,5.8f);

        System.out.println("The integer sum is : " + intsum);
        System.out.println("The float sum is : " + floatsum);
    }
}
