package PracticeQuestions;

public class practiceQuestion3 {
    static int N = 8;

    // Check if (x, y) is a valid move
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Print solution
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.printf("%2d ", sol[x][y]);
            }
            System.out.println();
        } 
    }

    // Solves Knight Tour problem
    public static boolean solveKT() {
        int sol[][] = new int[N][N];

        // Initialize solution matrix
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        // Knight moves
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        // Start from (0,0)
        sol[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
            return true;
        }
    }

    // Recursive utility function
    public static boolean solveKTUtil(int x, int y, int movei,
         int sol[][], int xMove[], int yMove[]) {

        if (movei == N * N)
            return true;

        for (int k = 0; k < 8; k++) {
            int next_x = x + xMove[k];
            int next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;

                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1; // backtracking
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solveKT();
    }

}
