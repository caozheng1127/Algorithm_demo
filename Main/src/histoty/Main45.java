package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main45 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int p = Integer.parseInt(s[2]);
        s = bf.readLine().split(" ");
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < m; i++) {
            s = bf.readLine().split(" ");
            if (s[0].equals("A")) {
                a[Integer.parseInt(s[1]) - 1]++;
            }
            if (s[0].equals("B")) {
                a[Integer.parseInt(s[1]) - 1]--;
            }
        }
        int count = 0;
        int goal = a[p - 1];
        Comparator<Integer> cmp = (i1, i2) -> i2 - i1;
        Arrays.sort(a, cmp);
        for (int anA : a) {
            count++;
            if (anA == goal) {
                break;
            }
        }
        System.out.println(count);
    }
}
