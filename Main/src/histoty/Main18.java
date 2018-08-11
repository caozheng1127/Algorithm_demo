package histoty;

import java.util.*;

public class Main18 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[][] a = new int[n][4];
            for (int i = 0; i < n; i++) {
                int m = scan.nextInt();
                if (m == 1) {
                    a[i][0] = m;
                    for (int j = 1; j < 4; j++) {
                        a[i][j] = scan.nextInt();
                    }
                }
                if (m == 2) {
                    a[i][0] = m;
                    for (int j = 1; j < 3; j++) {
                        a[i][j] = scan.nextInt();
                    }
                }
            }
            int sum = 0;
            int[] day = new int[100];
            for (int i = 0; i < day.length; i++) {
                day[i] = -1000000;
            }
            for (int i = 0; i < n; i++) {
                if (a[i][0] == 2) {
                    sum = sum + a[i][2];
                }
                if (a[i][0] == 1) {
                    for (int j = 0; j < day.length; j++) {
                        if (j >= a[i][1] && j <= a[i][2]) {
                            day[j] = day[j] > a[i][3] ? day[j] : a[i][3];
                        }
                    }
                }
            }
            for (int i = 0; i < day.length; i++) {
                if (day[i] != -1000000) {
                    sum = sum + day[i];
                }
            }
            System.out.print(sum);
        }
    }
}

