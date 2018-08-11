import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author caozheng
 * @Description 模板
 * @date 2018/8/5 16:53
 */
public class Main00 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int[] a = new int[21];
            for (int i = 0; i < 21; i++) {
                a[i] = scan.nextInt();
            }
        }
    }
}
