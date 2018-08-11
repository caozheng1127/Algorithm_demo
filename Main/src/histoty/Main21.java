package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caozheng
 * @Description
 * @date 2018/8/5 20:06
 */
public class Main21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a[]= bf.readLine().split(" ");
        int num = Integer.parseInt(a[0]);
        int vis = Integer.parseInt(a[1]);
        String[][] strings = new String[num][num];
        for(int i = 0; i < num; i++) {
            String[] input = bf.readLine().split(" ");
            for(int j = 0; j < input.length; j++) {
                strings[i][j] = input[j];
            }
        }

        int[] count = new int[num];
        for(int i = 0; i < count.length; i++) {
            count[i]=0;
        }
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if (strings[i][j]==null){
                    break;
                }
                count[Integer.parseInt(strings[i][j])]++;
            }
        }
        for(int i = 0; i < num; i++) {
            if (strings[vis][i]==null){
                break;
            }
            count[Integer.parseInt(strings[vis][i])]=-1;
        }
        int max = 0;
        for(int i = 0; i < count.length; i++) {
            max = count[i]>max?i:max;
        }
        if (max == 0){
            System.out.println(-1);
        }
        System.out.print(max);
    }
}
