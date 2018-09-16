package histoty;

import java.util.Scanner;

public class Main40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int result = func1(n, a);
        System.out.println(result);
    }

    private static int func1(int n, int[][] a) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                    count++;
                    func2(n, a, i, j);
                }
            }
        }
        return count;
    }

    private static void func2(int n, int[][] a, int i1, int i2) {
        for (int i = i1; i < n; i++) {
            if (a[i][i2] == 1) {
                a[i][i2] = 0;
                func2(n, a, i, i2);
            }
        }
        for (int j = i2; j < n; j++) {
            if (a[i1][j] == 1) {
                a[i1][j] = 0;
                func2(n, a, i1, j);
            }
        }
    }
}

