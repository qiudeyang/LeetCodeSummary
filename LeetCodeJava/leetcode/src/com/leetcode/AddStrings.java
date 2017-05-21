package com.leetcode;

/**
 * Created by qiudeyang on 09/10/16.
 */
class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;
        int nums1 = num1.length() - 1;
        int nums2 = num2.length() - 1;
        for(;nums1 >= 0 || nums2 >= 0;nums1--, nums2--){
            int temp1 = nums1 < 0 ?0:num1.charAt(nums1)-'0';
            int temp2 = nums2 < 0 ?0:num2.charAt(nums2)-'0';
            sum = temp1 + temp2 + carry;
            if(sum <= 9){
                sb.append(sum);
                sum = 0;
                carry = 0;
            }else{
                sb.append(sum % 10);
                sum = 0;
                carry = 1;
            }
        }
        if(carry == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
public class AddStrings {
    public static void main(String[] args) {
        Solution415 solution415 = new Solution415();
        String a = "9333852702227987";
        String b = "85731737104263";
        System.out.println(solution415.addStrings(a,b));
    }
}
