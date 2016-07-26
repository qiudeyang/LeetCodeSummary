package com.test;

/**
 * Created by qiudeyang on 17/06/16.
 */
import java.util.List;
import java.util.LinkedList;
class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            if ((n & (int)Math.pow(2,i)) != 0){
                sum++;
            }
        }
        if(n < 0 ){
            return sum+1;
        }else{
            return sum;
        }
    }
}
public class TestNumberOfBits {
    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        int n = 11;
        System.out.println(solution191.hammingWeight(0x7fffffff+1));
    }
}

