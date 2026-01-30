package PracticeQuestions;

public class practiceQuestion2 {

    final static char[][] L = {
        {}, {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public static void letterCombinations(String D) {
        if (D.length() == 0) {
            System.out.println("");
            return;
        }
        dfs(0, new StringBuilder(), D);
    }

    public static void dfs(int pos, StringBuilder sb, String D) {
        if (pos == D.length()) {
            System.out.println(sb.toString());
            return;
        }

        char[] letters = L[D.charAt(pos) - '0'];
        for (char c : letters) {
            sb.append(c);
            dfs(pos + 1, sb, D);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
