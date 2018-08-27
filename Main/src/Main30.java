import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description
 * @date 2018/8/11 17:47
 */
public class Main30 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int num = Integer.parseInt(input[1]);
        int[] a = new int[count];
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        int m = 0;
        Map nums = new HashMap();
        nums.put(m, 0);
        for (int i = 0; i < a.length; i++) {
            if (m == a[i]) {
                int v = (Integer) nums.get(m);
                v++;
                nums.put(m, v);
            } else {
                nums.put(a[i], 1);
            }
            m = a[i];
        }
        Iterator iterator = nums.keySet().iterator();
        int maxNumber = 0;
        int minValue = 999999;
        while (iterator.hasNext()) {
            int key = (Integer) iterator.next();
            int value = (Integer) nums.get(key);
            if (value >= maxNumber) {
                maxNumber = value;
                if (key < minValue ){
                    minValue = key;
                }
            }
        }
        System.out.println(minValue);
        int k = 0;
        int pis = 0;
        for(int i = 0; i <a.length ; i++) {
            if(a[i] == minValue){
                pis = i;
            }
        }
        for(int i = pis +1; i <a.length ; i++) {
            if (a[i] > minValue){
                k++;
                minValue = a[i];
            }
        }
        System.out.println(maxNumber*num + k);
    }
}
