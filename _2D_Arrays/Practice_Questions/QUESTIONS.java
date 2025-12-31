package _2D_Arrays.Practice_Questions;
import java.util.*;

public class QUESTIONS {

    // Count occurrences of key in matrix
    public static int count(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Sum of elements of a given row
    public static int rowSum(int matrix[][], int row) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Count a key
        System.out.print("Enter element to count: ");
        int key = sc.nextInt();
        int result = count(matrix, key);
        System.out.println("Count of " + key + " = " + result);

        // Row sum
        System.out.print("Enter row index to find sum (0-based): ");
        int row = sc.nextInt();
        int sum = rowSum(matrix, row);
        System.out.println("Sum of row " + row + " = " + sum);

        sc.close();
    }
}
