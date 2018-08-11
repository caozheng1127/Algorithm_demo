package histoty; /**
 * Created by tree on 2018/3/21.
 */

import java.util.*;
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String put ="input error";
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int b =0;

            int[][] maze = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maze[i][j] = sc.nextInt();
                    b++;
                }
            }
            String str = sc.nextLine();

            if (b==n*m) {


                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (maze[i][j] == Integer.parseInt(str)) {
                            put = "1";
                        } else {
                            put = "0";

                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (maze[i][j]<=0);
                    put ="input error";
                }
            }
            System.out.println(put);
        }
    }
}
