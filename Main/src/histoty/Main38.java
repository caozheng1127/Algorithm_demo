package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main38 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String[] ss = s.split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int t = Integer.parseInt(ss[2]);
        String string = bf.readLine();
        String[] strings = string.split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strings[i]);
        }

        int sum = 0;
        for (int i = 0; i < n-k+1; i++) {
            if (judge(a , i , i+k-1, t, k)){
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static boolean judge(int[] a, int start , int end ,int t, int k){
        boolean flag = false;
        a = subInt(a ,start, k);
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int anA : a) {
            if (map.containsKey(anA)) {
                map.put(anA, map.get(anA) + 1);
            } else {
                map.put(anA, 0);
            }
        }
        int count=-1;
        int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count || (entry.getValue() == count && entry.getKey() > max)) {
                max = entry.getKey();
                count = entry.getValue() + 1;
            }
        }
        if (count>=t){
            flag = true;
        }
        return flag;
    }

    private static int[] subInt(int[] src, int begin, int count) {
        int[] bs = new int[count];
        System.arraycopy(src, begin, bs, 0, count);
        return bs;
    }
}
