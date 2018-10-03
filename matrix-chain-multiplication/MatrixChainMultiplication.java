class MatrixChainMultiplication {
    static void printParenthesis(int i, int j, int n, int[][] bracket, char name) {
        if (i == j) {
            System.out.print(name++);

            return;
        }

        System.out.print("(");

        printParenthesis(i, bracket[i][j], n, bracket, name);

        printParenthesis(bracket[i][j] + 1, j, n, bracket, name);

        System.out.print(")");
    }

    static void matrixChainOrder(int p[], int n) {

        int m[][] = new int[n][n];
        int bracket[][] = new int[n][n];

        for (int i = 1; i < n; i++)
            m[i][i] = 0;

        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;

                        bracket[i][j] = k;
                    }
                }
            }
        }

        char name = 'A';

        System.out.println("Optimal Parenthesization is : ");
        printParenthesis(1, n - 1, n, bracket, name);
        System.out.println("\nOptimal Cost is : " + m[1][n - 1]);
    }

    public static void main(String... input) {
        // int arr[] = { 40.20, 10, 30 };
        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        // int n = sizeof(arr) / sizeof(arr[0]);
        matrixChainOrder(arr, n);

    }
}