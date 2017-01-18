package com.leetcode;

/**
 * Created by qiudeyang on 29/12/16.
 */
class Solution461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while(z != 0){
            z = z & (z-1);
            count++;
        }
        return count;
//        return Integer.bitCount(x^y);
    }
}
public class HammingDistance {
    public static void main(String[] args) {
        Solution461 solution461 = new Solution461();
        System.out.println(solution461.hammingDistance(1,4));
    }
}
