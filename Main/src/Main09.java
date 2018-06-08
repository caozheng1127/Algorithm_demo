/**
 * Created by tree on 2018/3/28.
 */
import java.util.*;
public class Main09 {
    public static final void main(String[] args) {
        char[] s = new char[1005];

        char mp1[]={'Q','W','E','R','T','Y','U','I','O','P','A','S',
                'D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char mp2[]={'A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String arr[] = str.split("");
            char tmp='A';
            for(int i=0;i<arr.length;i++)
            {
                if(s[i]>='A'&&s[i]<='Z')
                {
                    int j;
                    for(j=0;j<26;j++)
                    {
                        if(s[i]==mp2[j])
                            break;
                    }
                    System.out.println(mp1[j]); //system("pause");
                }
                else if(s[i]>='a'&&s[i]<='z')
                {
                    int j;
                    String t = String.valueOf(s[i] - 'a' + 'A');
                    s[i] = t.charAt(0); //cout<<s[i]<<endl; system("pause");
                    for(j=0;j<26;j++)
                    {
                        if(s[i]==mp2[j])
                            break;
                    }
                    System.out.println(mp1[j]-'A'+'a');
                }
                else System.out.println(s[i]);
            }
            System.out.println();

        }
    }
}
