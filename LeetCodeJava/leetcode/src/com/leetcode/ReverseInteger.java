package com.leetcode;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution {
    public int reverseInteger(int x) {
        String a = " " + x;
        if (a.contains("-")) {
            char[]  array = a.toCharArray();
            char[]  array1 = new char[array.length-1];
            for(int i = 0;i < array1.length;i++){
                array1[i] = array[array.length-1-i];
            }
            String b = "-"+array1.toString();
            System.out.println(b);
            return 1;
        } else {
            StringBuffer s = new StringBuffer(a);
            s.reverse();
            return Integer.parseInt(s.toString());
        }
    }
}
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseInteger(1234));
    }
}
