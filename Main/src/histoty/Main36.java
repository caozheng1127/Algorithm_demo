package histoty;

import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sc = scan.nextLong();
        String string = Long.toBinaryString(sc);
        String[] result = string.split("");
        int sum = 0;
        for (String aResult : result) {
            if (aResult.equals("1")) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
