package histoty;

import java.util.*;

public class Main16 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<Integer> list = new ArrayList<Integer>();
        while (scan.hasNext()) {
            //list.add(scan.nextInt());
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            System.out.println(func(a));
        }
    }

    public static String func(int[] a) {
        String str = "";
        int m = a[0] / (2 * a[2]);
        int n = a[1] / (2 * a[2]);
        if (m * n % 2 == 1) {
            str = "The first one is winner.";
        } else {
            str = "The second one is winner.";
        }
        return str;
    }
}
