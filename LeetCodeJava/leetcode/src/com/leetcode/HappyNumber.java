package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 15/10/16.
 */
class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int result;
        while(set.add(n)){
            result = 0;
            while (n > 0){
                result += (int)Math.pow(n % 10,2);
                n = n / 10;
            }
            if (result == 1){
                return true;
            }else{
                n = result;
            }
        }
        return false;
    }
}
public class HappyNumber {
    public static void main(String[] args) {
        Solution202 solution202 = new Solution202();
        System.out.println(solution202.isHappy(19));
    }
}
