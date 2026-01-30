package OOPS.Practice_Questions;

public class Practice_Question6 {

    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }

    public static void main(String[] args) {
        Practice_Question6.changeB();
        System.out.print(Practice_Question6.a + Practice_Question6.b);
    }
}
