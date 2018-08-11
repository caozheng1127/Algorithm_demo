package histoty;

import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        char[] chars = str.toCharArray();
        int r = chars.length / 4;
        char[][] num = new char[r + 1][r + 1];
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < r + 1; j++) {
                num[i][j] = ' ';
            }
        }
        int index = 0;
        for (int j = 0; j < r + 1; j++) {
            num[0][j] = chars[index++];
        }
        for (int i = 1; i < r + 1; i++) {
            num[i][r] = chars[index++];
        }
        for (int j = r - 1; j >= 0; j--) {
            num[r][j] = chars[index++];
        }
        for (int i = r - 1; i >= 1; i--) {
            num[i][0] = chars[index++];
        }
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < r + 1; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}