package com.leetcode;

/**
 * Created by qiudeyang on 17/06/16.
 */
import java.util.List;
import java.util.LinkedList;
class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int m = 0;
        if (n < 0){
            m = Math.abs(n);
        }else {
            m = n;
        }
        int sum = 0;
        int k = 0;
        List<Integer>  list = new LinkedList<Integer>();
        do{
            list.add(m % 2);
            m = m / 2;
            k++;
        }while( m / 2 != 0);
        for(int i = 0;i < list.size();i++){
            if(list.get(i) == 1){
                sum++;
            }
        }
        if (n < 0 && Math.abs(n) >= Math.pow(2,k)){
            return sum+2;
        }else if(n >= 0 && Math.abs(n) >= Math.pow(2,k)){
            return sum+1;
        }else if(n < 0 && Math.abs(n) < Math.pow(2,k)){
            return sum+1;
        }else{
            return sum;
        }

    }
}
public class NumberofBits {
    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        int n = 11;
        System.out.println(solution191.hammingWeight(n));
    }
}
