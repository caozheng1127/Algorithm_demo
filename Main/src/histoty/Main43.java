package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main43 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        for (int i = 0; i < number; i++) {
            String[] s1 = bf.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            int[][] a = new int[m][2];
            for (int j = 0; j < m; j++) {
                String[] s2 = bf.readLine().split(" ");
                a[j][0] = Integer.parseInt(s2[0]);
                a[j][1] = Integer.parseInt(s2[1]);
            }
            ;
            if (!judge(a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean judge(int[][] a) {
        boolean flag = false;
        if (a.length % 2 == 0) {
            flag = true;
        }
        return flag;
    }
}
