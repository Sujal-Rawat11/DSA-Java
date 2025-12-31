package Strings;

public class Substring {

    public static String substring(String str, int si, int ei){
        String substr = " ";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }


    //Substring
    public static void main(String args[]){
        //substring
        String str = "Hello World ";
        System.out.println(substring(str, 0, 5));
    }
}
