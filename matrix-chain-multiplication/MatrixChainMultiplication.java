public class MatrixChainMultiplication {

    void matrixchain(int a[]) {
        int q;
        int n = a.length;
        int m[][] = new int[n][n];
        int s[][] = new int[n][n];
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }
        for (int l = 2; l < n; l++) {

            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    q = m[i][k] + m[k + 1][j] + a[i - 1] * a[k] * a[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        print_optimal(s, 1, 6);
    }

    void print_optimal(int s[][], int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            print_optimal(s, i, s[i][j]);
            print_optimal(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }

    public static void main(String args[]) {
        int a[] = { 30, 35, 15, 5, 10, 20, 25 };
        MatrixChainMultiplication n = new MatrixChainMultiplication();
        n.matrixchain(a);
    }
}