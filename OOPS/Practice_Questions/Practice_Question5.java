package OOPS.Practice_Questions;

public class Practice_Question5{
    static int marks;
    void set_marks(int marks){
        //this.marks = marks; //Line 1
    }
}

class OOPS {
    public static void main(String args[]){
        Practice_Question5 t = new Practice_Question5();
        t.set_marks(98); //Line 2
        System.out.print(Practice_Question5.marks); //Line 3
    }
}
