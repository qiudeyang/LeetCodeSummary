package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution7 {
    public int reverseInteger(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverseInteger(1534236469));
    }
}
