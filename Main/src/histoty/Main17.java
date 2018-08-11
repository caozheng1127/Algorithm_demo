package histoty;

import java.util.*;

public class Main17 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                for (int j = 0; j < a[i]; j++) {
                    b.add(scan.nextInt());
                }
            }
            //System.out.println(b);
            func(n, a, b);
        }
    }

    public static ArrayList<Integer> func(int n, int[] a, ArrayList<Integer> b) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i]; j++) {
                list.add(dfs(k, a[i], b));
            }
            k = k + a[i] - 1;
        }
        return list;
    }

    public static int dfs(int k, int n, ArrayList<Integer> b) {
        int num = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList> list1 = new ArrayList<ArrayList>();
        for (int i = k; i < k + n; k++) {
            list.add(b.get(i));
            dfs(k, n, b);
        }
        return num;
    }
}
