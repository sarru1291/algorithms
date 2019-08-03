import java.util.Scanner;

public class StrassenMatrix {

    public static void main(String... input) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matrix 1: Enter elements");

        int a[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        int b[][] = new int[2][2];
        System.err.println("Matrix2: Enter elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        int m1, m2, m3, m4, m5, m6, m7;
        int[][] c = new int[2][2];
        m1 = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
        m2 = (a[1][0] + a[1][1]) * b[0][0];
        m3 = a[0][0] * (b[0][1] - b[1][1]);
        m4 = a[1][1] * (b[1][0] - b[0][0]);
        m5 = (a[0][0] + a[0][1]) * b[1][1];
        m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        m7 = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1]);

        c[0][0] = m1 + m4 - m5 + m7;
        c[0][1] = m3 + m5;
        c[1][0] = m2 + m4;
        c[1][1] = m1 - m2 + m3 + m6;
        System.out.println("Result: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}