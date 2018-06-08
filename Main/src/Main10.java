import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main10 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calculate(int M, String[] strs) {
        int ab=0;
        int ac=0;
        int ad=0;
        int ae=0;
        int bc=0;
        int bd=0;
        int be=0;
        int cd=0;
        int ce=0;
        int de=0;
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length()-2;j=j+2){
                if (strs[i]=="A"&&strs[i+2]=="B"||strs[i]=="B"&&strs[i+2]=="A"){
                    ab=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="A"&&strs[i+2]=="C"||strs[i]=="C"&&strs[i+2]=="A"){
                    ac=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="A"&&strs[i+2]=="D"||strs[i]=="D"&&strs[i+2]=="A"){
                    ad=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="A"&&strs[i+2]=="E"||strs[i]=="E"&&strs[i+2]=="A"){
                    ae=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="B"&&strs[i+2]=="C"||strs[i]=="C"&&strs[i+2]=="B"){
                    bc=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="B"&&strs[i+2]=="D"||strs[i]=="D"&&strs[i+2]=="B"){
                    bd=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="B"&&strs[i+2]=="E"||strs[i]=="E"&&strs[i+2]=="B"){
                    be=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="C"&&strs[i+2]=="D"||strs[i]=="D"&&strs[i+2]=="C"){
                    cd=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="C"&&strs[i+2]=="E"||strs[i]=="E"&&strs[i+2]=="C"){
                    ce=Integer.parseInt(strs[i+1]);
                }
                if (strs[i]=="D"&&strs[i+2]=="E"||strs[i]=="E"&&strs[i+2]=="D"){
                    de=Integer.parseInt(strs[i+1]);
                }
            }
        }


        return 0;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _M;
        _M = Integer.parseInt(in.nextLine().trim());

        int _strs_size = _M;
        String[] _strs = new String[_strs_size];
        String _strs_item;
        for(int _strs_i = 0; _strs_i < _strs_size; _strs_i++) {
            try {
                _strs_item = in.nextLine();
            } catch (Exception e) {
                _strs_item = null;
            }
            _strs[_strs_i] = _strs_item;
        }

        res = calculate(_M, _strs);
        System.out.println(String.valueOf(res));

    }
}