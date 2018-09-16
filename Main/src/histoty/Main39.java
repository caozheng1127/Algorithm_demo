package histoty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main39 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] strings = bf.readLine().split(" ");
        int[] a = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            a[i] = Integer.parseInt(strings[i]);
        }
        boolean flag = true;
        int pis = a.length;
        int j = 0;
        for (int i = a.length-1; i >= 0 ; i--) {
            if (i == 0){
                if(!(a[j]>0&&a[j]<=127)){
                    flag = false;
                }
            }

            if (i == 1){
                if(!(a[j]>127&&a[j]<=191)){
                    flag = false;
                }
            }

            if (i == 2){
                if(!(a[j]>191&&a[j]<=223)){
                    flag = false;
                }
            }

            if (i == 3){
                if(!(a[j]>223&&a[j]<=239)){
                    flag = false;
                }
            }
            j++;
        }
        if (flag){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}


//        for (int i = 0; i < a.length; i++) {
//            if (i == a.length-1 && a[i]<=127){
//                continue;
//            }
//            String[] split = Integer.toBinaryString(a[i]).split("");
//            for (int j = 0; j < pis-1; j++) {
//                if (!split[j].equals("1")){
//                    flag = false;
//                }
//            }
//            if (!split[pis-1].equals("0")){
//                flag = false;
//            }
//            pis--;
//        }