package com.leetcode;

/**
 * Created by qiudeyang on 11/07/16.
 */
class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while( i>=0 || j >= 0){
            int sum = carry;
            if (j>=0){
                sum += b.charAt(j--)-'0';
            }
            if (i>=0){
                sum += a.charAt(i--)-'0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Solution67 solution67 = new Solution67();
        System.out.println(solution67.addBinary(a, b));
    }

}
