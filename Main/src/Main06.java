/**
 * Created by tree on 2018/3/21.
 */
import java.util.*;
public class Main06 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[m];
            int[] sum = new int[m];
            for (int i = 0;i<n;i++){
                a[i] = scan.nextInt();
                b[i] = scan.nextInt();
            }
            for(int i=0;i<m;i++){
                c[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                sum[i]=0;
            }

            for(int i=0;i<m;i++){
                for(int j=0 ;j<n;j++){
                    if(c[i] >= a[j]){
                        sum[i] = sum[i]>b[j]?sum[i]:b[j];
                    }
                }
            }
            for(int i=0;i<m;i++){
                System.out.println(sum[i]);
            }
        }
    }
}

//import java.util.*;
//public class Main {
//    public static final void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            int m = scan.nextInt();
//            long[] a = new long[n];
//            long[] b = new long[n];
//            long[] c = new long[m];
//            long[] sum = new long[m];
//            for (int i = 0;i<n;i++){
//                a[i] = scan.nextLong();
//                b[i] = scan.nextLong();
//            }
//            for(int i=0;i<m;i++){
//                c[i]=scan.nextLong();
//            }
//            for(int i=0;i<m;i++){
//                for(int j=0 ;j<n;j++){
//                    if(c[i] >= a[j]){
//                        sum[i] = sum[i]>b[j]?sum[i]:b[j];
//                    }
//                }
//            }
//            for(int i=0;i<m;i++){
//                System.out.println(sum[i]);
//            }
//        }
//    }
//}