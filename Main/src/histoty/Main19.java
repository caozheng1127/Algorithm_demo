package histoty;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main19 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
            String[] strings = input.split("");
            if(strings.length==2){
                System.out.print(strings[1]);
                return;
            }
            //String[] strings = StringUtils.splitString(input,"");
            int r = (strings.length-1)/4;
            for(int i = 1; i < r+2; i++) {
                System.out.print(strings[i]);
            }
            for(int i = 1; i < r; i++) {
                System.out.println();
                System.out.print(strings[strings.length-i]);
                for(int j = 0; j < r-1; j++) {
                    System.out.print(" ");
                }
                System.out.print(strings[r+i+1]);
            }
            System.out.println();
            for(int i = 1; i < r+2; i++) {
                System.out.print(strings[strings.length-i-r+1]);
            }

    }
}
