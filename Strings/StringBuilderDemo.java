package Strings;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // ✅ correct object

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // ✅ append belongs to StringBuilder
        }

        System.out.println(sb);
    }
}
