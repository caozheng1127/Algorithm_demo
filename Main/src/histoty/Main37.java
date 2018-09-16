package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main37 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        int count = Integer.parseInt(bf.readLine());
        int num = 100;
        String[] a = new String[num];
        String[] b = new String[num];
        String[] c = new String[num];
        int i = 0;
        while ((str = bf.readLine()) != null ) {
            String[] strings = str.split(" ");
            if (strings.length > 0) {
                a[i] = strings[0];
                b[i] = strings[1];
                if (strings.length > 2) {
                    c[i] = strings[2];
                }
                i++;
            }
        }
        final int cacheSize = count;
        Map<String, String> map = new LinkedHashMap<String, String>((int) Math.ceil(cacheSize / 0.75f) + 1, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > cacheSize;
            }
        };
        for (int j = 0; j < i; j++) {
            if (a[j].equals("p")) {
                map.put(b[j],c[j]);
            }
            if (a[j].equals("g")){
                if (map.containsKey(b[j])){
                    System.out.println(map.get(b[j]));
                }else {
                    System.out.println("-1");
                }
            }
        }
    }
}