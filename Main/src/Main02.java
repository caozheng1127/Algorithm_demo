import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=0,c=0,d=0,sum=0;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            }

//        System.out.println(n);
//        for(int i=0 ;i<nums.length;i++) {
//            System.out.println(nums[i]);
//        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]==1)
                a++;
            if (nums[i]==2)
                b++;
            if (nums[i]==3)
                c++;
            if (nums[i]==4)
                d++;
        }

        sum = d;
        if (a-c>=0){
            sum = sum+c;
            a=a-c;
            if(b%2==0){
                if(a%4==0)
                sum = sum+b/2+a/4;
                if (a%4!=0){
                    sum = sum+b/2+a/4+1;
                }
            }else {
                if(a>2){
                    if ((a-2)%4==0) {
                        sum = sum + (a-2) / 4 + 1 + b / 2;
                    }
                    if ((a-2)%4!=0) {
                        sum = sum + (a-2) / 4 + 1 + b / 2 +1;
                    }
                }else{
                        sum = sum  + b / 2 +1;
                }
            }
        }else {
            sum = sum + a;
            c = c - a;
            if (b % 2 == 0) {
                sum = sum + b / 2 + c;
            } else {
                sum = sum + c + 1 + b / 2;
            }
        }
        System.out.println(sum);

    }

}
