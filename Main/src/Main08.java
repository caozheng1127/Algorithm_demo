/**
 * Created by tree on 2018/3/21.
 */
//import java.util.*;
//public class Main08 {
//    public static final void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String str = in.nextLine();
//            String arr[] = str.split(" ");
//            String arr1[] = str.split(",");
//            int[] a = new int[arr1.length];
//            for(int i=0; i<arr1.length; i++){
//                a[i] = Integer.parseInt(arr1[i]);
//            }
//            int l = 0;
//            for(int i=0; i<arr1.length-1; i++) {
//                for (int j = i + 1; j < arr1.length; j++) {
//                    l= l<plus(a,i,j)?plus(a,i,j):l;
//                }
//            }
//            System.out.println(l);
//            }
//        }
//
//
//    public static int plus(int[] num, int p ,int q){
//        int sum =0;
//                for (int k = p; k <= q; p++) {
//                    sum = sum + num[k];
//                }
//        return sum;
//        }
//}

import java.util.*;
import java.math.*;
public class Main08 {
    public static final void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String arr[] = str.split(" ");
            String arr1[] = str.split(","+" ");
            long[] a = new long[arr1.length];
            for(int i=0; i<arr1.length; i++){
                    a[i] = Integer.parseInt(arr1[i]);
                }


            long ans = a[0];
            long cnt = -999999999;
            long pre = -999999999;
            for(int i=0;i<arr1.length;i++)
            {
                if(i!=0) { cnt =pre+a[i]>=a[i]?pre+a[i]:a[i]; pre=cnt; }
                else pre=a[0];
                ans = ans>=cnt?ans:cnt;
            }
            System.out.println(ans);
        }
    }
}