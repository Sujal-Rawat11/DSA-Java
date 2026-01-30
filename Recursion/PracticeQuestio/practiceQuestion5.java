package Recursion.PracticeQuestio;

public class practiceQuestion5 {

    public static void TowerOfHanoi(int n, String src, String helper, String dest) {

        // Base case
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1: move n-1 disks from src to helper
        TowerOfHanoi(n - 1, src, dest, helper);

        // Step 2: move nth disk from src to dest
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);

        // Step 3: move n-1 disks from helper to dest
        TowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
