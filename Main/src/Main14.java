import java.util.*;
public class Main14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            Long[] a = new Long[n];
            for(int i=0;i<n;i++){
                a[i] = scan.nextLong();
            }
            for(int i=0;i<n;i++){
                if(a[i]%2==1){
                    System.out.println("No");
                    continue;
                }
                long cnt=a[i];
                long m =1;
                long mul;
                boolean bool =false;
                while(cnt>=1){
                    cnt=cnt/2;
                    m =m*2;
                    mul=m*cnt;
                    if(cnt%2==1&&mul==a[i]){
                        System.out.println(cnt +" "+ m);
                        bool=true;
                        break;
                    }
                }
                if(!bool){
                    System.out.println("No");
                }
                //System.out.println("No");
            }
           // System.out.println();
        }
    }
}


//import java.util.*;
//public class Main {
//    public static final void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            int[] a = new int[n];
//            for(int i=0;i<n;i++){
//                a[i] = scan.nextInt();
//            }
//            for(int i=0;i<n;i++){
//                for(int j=2;j<100000;j=j+2){
//                    int m = a[i]/j;
//                    int cnt = m*j;
//                    if(m%2==1&&cnt==a[i]){
//                        System.out.println(m +" "+ j);
//                        break;
//                    }
//                    if(j==99998){
//                        System.out.println("No");
//                    }
//                }
//                //System.out.println("No");
//            }
//            // System.out.println();
//        }
//    }
//}