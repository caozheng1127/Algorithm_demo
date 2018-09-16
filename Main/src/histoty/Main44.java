package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main44 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split("");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int n = a[0] + a[1] + a[2];
        int m = a[3] + a[4] + a[5];

        int nm = Math.abs(n - m);
        int nm0 = 9 - Math.abs(a[0] - a[3]);
        int nm1 = 9 - Math.abs(a[1] - a[4]);
        int nm2 = 9 - Math.abs(a[2] - a[5]);

        int count = 2;
        if (nm <= nm0 + nm1 || nm <= nm0 + nm2 || nm <= nm1 + nm2) {
            count = 2;
        }
        if (nm <= nm0 || nm <= nm1 || nm <= nm2) {
            count = 1;
        }
        if (n == m) {
            count = 0;
        }
        System.out.println(count);
    }
}
