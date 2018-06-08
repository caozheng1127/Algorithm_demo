import java.util.Scanner;

/**
 * Created by tree on 2018/3/20.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nums = sc.nextLine();
        int a=nums.length();

        for(int i =0;i<a;i++){
            for(int j=i;j<a;j++){
                if(nums.charAt(i)==nums.charAt(j)){
                    if(nums.charAt(i)>=nums.charAt(i+1)){
                        nums = nums.substring(j-1,j+1);
                        a--;
                    }else {
                        nums = nums.substring(i-1,i+1);
                        a--;
                    }
                }
            }
        }
        System.out.println(nums);
    }
}
