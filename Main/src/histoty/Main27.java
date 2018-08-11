package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @Description
 * @date 2018/8/11 14:49
 */
public class Main27 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++) {
            stringBuilder.append('a');
        }
        for(int i = 0; i < m; i++) {
            stringBuilder.append('z');
        }
        ArrayList<String> list = function(stringBuilder.toString());
        if (list.size()>=k) {
            System.out.println(list.get(k - 1));
        }else {
            System.out.println(-1);
        }
    }

    private static ArrayList<String> function(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0)
            return res;
        TreeSet<String> temp = new TreeSet<>();
        function2(str.toCharArray(), 0, temp);
        res.addAll(temp);
        return res;
    }

    private static void function2(char[] array, int i, TreeSet<String> result) {
        if (i == array.length - 1) {
            result.add(new String(array));
        } else {
            for (int j = i; j < array.length; j++) {
                change(array, i, j);
                function2(array, i + 1, result);
                change(array, i, j);
            }
        }
    }

    private static void change(char[] array, int i, int j) {
        char temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
