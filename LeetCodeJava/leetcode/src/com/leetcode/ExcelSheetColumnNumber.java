package com.leetcode;

/**
 * Created by qiudeyang on 17/10/16.
 */
class Solution171 {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] array = s.toCharArray();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += (array[i]-'A'+1)*(int)Math.pow(26,array.length-1-i);
        }
        return result;
    }
}
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution171 solution171 = new Solution171();
        String s = "YZ";
        System.out.println(solution171.titleToNumber(s));
    }
}
