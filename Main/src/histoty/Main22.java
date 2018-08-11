package histoty;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int len = str.length();
        String first = "", last = "";
        for (int i = 1; i < len; i++) {
            num2 = 0;
            num3 = 0;
            first = str.substring(0, i);
            last = str.substring(i, len);
            if (func(first))
                num2++;
            if (func(last))
                num3++;
            for (int m = 1; m < first.length(); m++) {
                if (func1(first.substring(0, m) + "." + first.substring(m)))
                    num2++;
            }
            for (int n = 1; n < last.length(); n++) {
                if (func1(last.substring(0, n) + "." + last.substring(n)))
                    num3++;
            }
            num1 += (num2 * num3);
        }
        System.out.println(num1);
    }

    private static boolean func(String str) {
        if (str.charAt(0) == '0' && str.length() != 1)
            return false;
        return true;
    }

    private static boolean func1(String str) {
        String s = "";
        if (str.length() >= 1) {
            s = str.split("\\.")[0];
        }
        if (str.charAt(0) == '0' && s.length() != 1)
            return false;
        if (str.charAt(str.length() - 1) == '0')
            return false;
        if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.')
            return false;
        return true;
    }

}