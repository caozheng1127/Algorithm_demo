import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description
 * @date 2018/8/11 17:47
 */
public class Main29 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(bf.readLine());
        boolean[] flag = new boolean[sum];
        for(int n = 0; n < flag.length; n++) {
            flag[n] = false;
        }
        for (int i = 0; i < sum; i++) {
            int num = Integer.parseInt(bf.readLine());
            String[][] a = new String[num][];
            for (int j = 0; j < num; j++) {
                a[j] = bf.readLine().split("");
                Arrays.sort(a[j]);
            }
            for (int j = 0; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (Arrays.equals(a[j], a[k])) {
                        flag[i] = true;
                    }
                }
            }
        }
        for(int i = 0; i < sum; i++) {
            if (flag[i]){
                System.out.println("Yeah");
            }else {
                System.out.println("Sad");
            }
        }
    }
}
