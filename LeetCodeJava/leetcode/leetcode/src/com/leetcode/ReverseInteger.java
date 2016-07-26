package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution7 {
    public int reverseInteger(int x) {
        if (x >= 0) {
            String s = x + "";
            char[] array = s.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = array.length - 1; i >= 0; i--) {
                sb.append(array[i]);
            }
            String s1 = sb.toString();
            return Integer.parseInt(s1);
        }else {
            x = Math.abs(x);
            String s = x + "";
            char[] array = s.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = array.length - 1; i >= 0; i--) {
                sb.append(array[i]);
            }
            String s1 = sb.toString();
            int c = Integer.parseInt(s1);
            return c - 2 * c;
        }


    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        System.out.println(solution.reverseInteger(1534236469));
    }
}
