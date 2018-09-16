package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main42 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] cur = bf.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(cur[j]);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (judge(i, j, a)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean judge(int i, int j, int[][] a) {
        boolean flag = false;
        if (a[i][0] < a[j][0] && a[i][1] < a[j][1] && a[i][2] < a[j][2]) {
            flag = true;
        }
        return flag;
    }
}
