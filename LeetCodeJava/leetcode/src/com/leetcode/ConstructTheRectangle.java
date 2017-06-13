package com.leetcode;

/**
 * Created by qiudeyang on 13/06/17.
 */
class Solution492 {
    public int[] constructRectangle(int area) {
        if (area < 0) {
            return null;
        }
        int areasqrt = (int) Math.sqrt(area);
        int[] result = new int[2];
        while (areasqrt <= area) {
            if (area % areasqrt == 0) {
                result[0] = Math.max(areasqrt,area/areasqrt);
                result[1] = Math.min(areasqrt,area/areasqrt);
                break;
            }
            areasqrt++;
        }
        return result;
    }
}

public class ConstructTheRectangle {
    public static void main(String[] args) {
        Solution492 solution492 = new Solution492();
        int[] result = solution492.constructRectangle(2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
