package com.leetcode;

/**
 * Created by qiudeyang on 17/10/16.
 */
class Solution168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int temp = n % 26;
            n = n- n / 26 * 26;
            if (temp == 0){
                sb.insert(0,'Z');
                if (n == 1){
                    break;
                }
            }else{
                sb.insert(0, (char) (temp - 1 + 'A'));
            }
        }
        return sb.toString();
    }
}

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution168 solution168 = new Solution168();
        System.out.println(solution168.convertToTitle(52));
    }
}
