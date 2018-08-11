package histoty; /**
 * Created by tree on 2018/3/21.
 */
import java.util.*;
public class Main07 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int[] a = new int[21];
            for(int i=0;i<21;i++){
                a[i] = scan.nextInt();
            }
            int sum =0;
            int t = 0;
            for(int i=0;i<21-3;i++){
                if(a[i]+a[i+1]+a[i+2]+a[i+3]>sum){
                    t = i;
                }
                sum = a[i]+a[i+1]+a[i+2]+a[i+3]>sum?a[i]+a[i+1]+a[i+2]+a[i+3]:sum;
            }
            System.out.println(t);
        }
    }
}