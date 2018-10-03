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

    static void trace(int[][] m, String s1, String s2, int l1, int l2) {
        int x = 0;
        char lcs[] = new char[5];

        int i = l1, j = l2;
        while (i == l1 && j == l2) {
            if (m[i][j] > m[i - 1][j] && m[i][j] > m[i][j - 1]) {
                lcs[x] = s1.charAt(i);
            }
        }

    }

    static void lcs(String s1, String s2, int l1, int l2) {

        int[][] matrix = new int[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        printMatrix(matrix, l1, l2);
        trace(matrix, s1, s2, l1, l2);
    }

    public static void main(String[] input) {
        String str1 = input[0];
        String str2 = input[1];
        int l1 = str1.length();
        int l2 = str2.length();
        lcs(str1, str2, l1, l2);
    }
}