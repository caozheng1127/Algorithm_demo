//回文字符串

import java.util.*;
public class Main15 {
    public static final void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //char[] a = new char[str.length()];
        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0;i<str.length();i++){
                //a[i] = str.charAt(i);
            list.add(str.charAt(i));
        }

        int[] vis = new int[str.length()];
        for(int i=0;i<vis.length;i++){
            vis[i]=0;
        }
        int sum =0;
        int max=0;
        dfs(list,sum,vis,num);
        for(int i=0;i<num.size();i++){
            max= max>num.get(i)?max:num.get(i);
        }
        System.out.println(max);

    }

    public static boolean func(ArrayList<Character> list){
        int k=list.size()/2;
        if(list.size()==1){
            return true;
        }
        for(int i=0;i<k;i++){
            if (list.get(i) != list.get(list.size()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static int dfs(ArrayList<Character> list,int sum,int[] vis,ArrayList<Integer> num){
        for(int i=0;i<list.size();i++){
            if(vis[i]==0)
            {
                vis[i]=1;
                if(func(list)){
                    sum=sum+1;
                    num.add(sum);
                }
                char t =list.get(i);
                list.remove(i);
//                if(func(list)){
//                    sum=sum+1;
//                }
                dfs(list,sum,vis,num);
                vis[i]=0;
                list.add(t);
            }
        }
        return sum;
    }
}
