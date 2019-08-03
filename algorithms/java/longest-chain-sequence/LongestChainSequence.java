import java.util.ArrayList;

public class LongestChainSequence {

    static void printMatrix(int[][] m, int l1, int l2) {
        System.out.println("LCS matrix: ");
        for (int i = 0; i <= l1; i++) {
            // System.out.println(l1 + " " + l2);
            for (int j = 0; j <= l2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // static void trace(int[][] m, String s1, String s2, int l1, int l2) {
    // int x = 0;
    // ArrayList<String> lcs = new ArrayList<String>();

    // int i = (l1 - 1);
    // int j = (l2 - 1);
    // System.out.print(s1.charAt(i) + " " + i + " " + j + " " + m[i][j]);
    // System.out.print(s1.charAt(i -= 1));
    // System.out.print(s1.charAt(i -= 2));

    // // for (int l = 0; l < lcs.size(); l++) {
    // // System.out.println(lcs.get(l));
    // // }
    // }

    static void lcs(String s1, String s2, int l1, int l2) {

        int[][] matrix = new int[l1 + 1][l2 + 1];
        char[] lcmElements = new char[l1];
        int x = 0;
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    // lcmElements[x] = s1.charAt(i - 1);
                    // x++;

                } else
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        printMatrix(matrix, l1, l2);
        // trace(matrix, s1, s2, l1, l2);

    }

    public static void main(String[] input) {
        String str1 = input[0];
        String str2 = input[1];
        int l1 = str1.length();
        int l2 = str2.length();
        lcs(str1, str2, l1, l2);
    }
}