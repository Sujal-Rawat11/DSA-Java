package BitManipulation.Practice_Questions;
/* Convert uppercase to lowercase characters using bits */

public class Question4 {
    public static void main(String args[]){
        //Convert uppercase character to lowercase
        for(char ch = 'A'; ch<='Z';ch++){
            System.out.println((char)(ch | ' '));
            //print abcdefghijklmnopqrstuvwxyz
        }
    }
}
