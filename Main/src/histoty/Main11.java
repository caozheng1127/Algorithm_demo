package histoty;

import java.util.*;
public class Main11 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = scan.nextInt();
            }
            int sum =0;
            for(int i = 0;i<n;i++){
                sum = sum + a[i];
            }
            int[] bool = new int[n];
            for(int i = 0;i<n;i++){
                bool[i]=0;
            }
            if(dfs(a,bool,0,m)){
                System.out.println("perfect");
            }else {
                System.out.println("good");
            }
            }

            //System.out.println();
    }
    public static boolean dfs(int[] a,int[] bool,int ans,int m){
        for(int i = 0;i<a.length;i++){
            if(bool[i]!=1) {
                ans = ans + a[i];
                bool[i] = 1;
                if (ans == m) {
                    return true;
                } else {
                    if (i < a.length - 1) {
                        dfs(a, bool, ans, m);
                      //  bool[i]=0;
                        dfs(a, bool, ans - a[i], m);
                    }
                }
            }

        }
        return false;
    }
}


//import java.util.*;
//public class Main {
//    public static final void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            long m = scan.nextLong();
//            long[] a = new long[n];
//            for (int i = 0;i<n;i++){
//                a[i] = scan.nextInt();
//            }
//            long sum =0;
//            for(int i = 0;i<n;i++){
//                sum = sum + a[i];
//            }
//            if(m==sum){
//                System.out.println("perfect");
//            }else {
//                System.out.println("good");
//            }
//        }
//
//        //System.out.println();
//    }
//}