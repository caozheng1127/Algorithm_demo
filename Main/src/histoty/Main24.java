package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description
 * @date 2018/8/11 14:46
 */
public class Main24 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int time = Integer.parseInt(input[0]);
        int waketime = Integer.parseInt(input[1]);

        String[] a = bf.readLine().split(" ");
        String[] b = bf.readLine().split(" ");
        int[] num = new int[time];
        for(int i = 0; i < num.length; i++) {
            num[i]=0;
        }
        for (int i = 0; i < time; i++) {
            if (b[i].equals("1")){
                continue;
            }
            int[] vis = new int[time];
            for (int j = 0; j < waketime; j++) {
                if((i+j)<time) {
                    vis[i + j] = 1;
                }
            }
            for(int k = 0; k < time; k++) {
                if(vis[k]==1 || b[k].equals("1")){
                    num[i] = num[i] + Integer.parseInt(a[k]);
                }
            }
        }
        int Max = 0;
        for(int i = 0; i < time; i++) {
            Max = Max>num[i]?Max:num[i];
        }
        System.out.println(Max);
    }
}
