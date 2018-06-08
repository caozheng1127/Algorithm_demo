import java.util.*;
public class Main12 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[1005][5];
        int sum=0;
        while (scan.hasNext()) {
            int n = scan.nextInt();
           // int[] a = new int[5];
            for(int i=0;i<n;i++){
                for(int j=0;j<5;j++) {
                    a[i][j] =scan.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<5;j++) {
                   sum=sum+a[i][j];
                }
                if(sum%5==0){
                    System.out.println(sum/5);
                }
                else {
                    System.out.println(-1);
                }
            }
           // System.out.println();
        }
    }
}