package histoty;

import java.util.ArrayList;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int num = sc.nextInt();
        while(num-->0){
            arr.add(sc.nextInt());
        }
        //int num = 5;
        /*arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(3);
        arr.add(3);*/
        int res = 0;
        do{
            if(findUp(arr)>findDown(arr)){
                removeUp(arr);
            }else if(findUp(arr)<findDown(arr)){
                removeDown(arr);
            }else{
                arr.remove(0);
            }
            res++;
        }while (!arr.isEmpty());

        System.out.println(res);

    }

    private static int findUp(ArrayList<Integer> a){
        int num = 0;
        int key = a.get(0);
        for(int i = 1; i < a.size(); i++){
            if(key < a.get(i)){
                key = a.get(i);
                num++;
            }
        }
        return num;
    }

    private static int findDown(ArrayList<Integer> a){
        int num = 0;
        int key = a.get(0);
        for(int i = 1; i < a.size(); i++){
            if(key > a.get(i)){
                key = a.get(i);
                num++;
            }
        }
        return num;
    }

    private static void removeUp(ArrayList<Integer> a){
        int key = a.get(0);
        for(int i = 1; i<a.size();i++){
            if(key < a.get(i)){
                key = a.remove(i);
            }
        }
        a.remove(0);
    }

    private static void removeDown(ArrayList<Integer> a){
        int key = a.get(0);
        for(int i = 1; i<a.size();i++){
            if(key > a.get(i)){
                key = a.remove(i);
            }
        }
        a.remove(0);
    }
}