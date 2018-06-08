import java.util.*;
public class Main13 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[100][100];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum=0;
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] b = new int[n];
            // int[] a = new int[5]
            for(int i=0;i<n;i++){
                int k = scan.nextInt();
                b[i]=k;
               // int s[] = new int[2*k];
                for(int j=0;j<2*k;j++){
                    a[i][j]= scan.nextInt();
                   // s[j]=a[i][j];
                   // list.add(a[i][j]);
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<2*b[i];j++){
                    list.add(a[i][j]);
                }
                Collections.sort(list);
                if(list.get(list.size()/2 )>list.get(list.size()/2 -1)){
                    System.out.println("YES");
                    list.clear();
                }
                else {
                    System.out.println("NO");
                    list.clear();
                }
            }
        }
    }
}