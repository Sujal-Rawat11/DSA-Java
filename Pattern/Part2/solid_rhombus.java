package Pattern.Part2;

public class solid_rhombus {

    public static void solid_Rhombus(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_Rhombus(5);
    }
}
