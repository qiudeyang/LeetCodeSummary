package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 18/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int i = 0;
        while (i < len && sc.hasNext()) {
            arr[i++] = sc.nextInt();
        }
        System.out.println(help(arr,0));
    }
    public static int help(int[] arr,int start) {
        if(start>=arr.length) return 1;
        int i=start;
        Set<Integer> set = new HashSet<>();
        int res=0;
        while(set.add(arr[i])){
            i++;
            if(i>=arr.length){
                res+=1;
                break;
            }
            res+=help(arr, i);
        }
        return res;
    }
}
