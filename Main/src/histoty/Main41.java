package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main41 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bf.readLine();
        System.out.println(func(readLine));
    }

    private static int func(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int i1 = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            i1 = Math.max(i1, (hashMap.containsKey(c)) ? hashMap.get(c) + 1 : 0);
            result = Math.max(result, i - i1 + 1);
            hashMap.put(c, i);
        }
        return result;
    }
}
