package com.leetcode;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution397 {
    public int integerReplacement(int n) {
        if (n == 1){
            return 0;
        }else if (n == 2){
            return 1;
        }else{
            int count = 0;
            int temp = n;
            while (temp % 2 == 0){
                count++;
                temp = temp / 2;
                if (temp == 2){
                    return count+1;
                }
            }
            if (temp % 2 != 0){
                count = count + Math.min(integerReplacement(temp+1),integerReplacement(temp-1)) + 1;
            }
            return count;
        }
    }
}
public class IntegerReplacement {
    public static void main(String[] args) {
        Solution397 solution397 = new Solution397();
//        System.out.println(solution397.integerReplacement(6));
//        System.out.println(solution397.integerReplacement(8));
//        System.out.println(Math.min(solution397.integerReplacement(6),solution397.integerReplacement(8)));
        System.out.println(solution397.integerReplacement(6));
    }
}
