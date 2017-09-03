package com.test;

/**
 * Created by qiudeyang on 03/09/17.
 */
class Solution8 {
    public boolean isMinus = false;
    public boolean isValid = true;

    public int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            isValid = false;
            return 0;
        }
        int length = str.length();
        int index = 0;
        while (index < length && str.charAt(index) == ' ') {
            index++;
        }
        long result = 0;
        if (index == length) {
            isValid = false;
            return 0;
        }
        if (str.charAt(index) == '+') {
            result = helper(str, index + 1, length-1,isMinus);
        } else if (str.charAt(index) == '-') {
            isMinus = true;
            result = helper(str, index + 1, length-1,isMinus);
        } else {
            result = helper(str, index, length-1,isMinus);
        }
        return (int) result;
    }

    public long helper(String str,int startIndex,int endIndex,boolean isMinus){
        if (startIndex>endIndex){
            return 0;
        }
        int flag = 1;
        if (isMinus){
            flag = -1;
        }
        long result = 0;
        for (int i = startIndex; i <= endIndex ; i++) {
            if (str.charAt(i)<='9'&&str.charAt(i)>='0'){
                result = result*10+flag*(str.charAt(i)-'0');
            }
            if (!isMinus && result > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
            }
            if (isMinus && result < Integer.MIN_VALUE){
                result = Integer.MIN_VALUE;
            }
            if (str.charAt(i)>'9'|| str.charAt(i)<'0'){
                return result;
            }
        }
        return result;
    }
}

public class TestAtoi {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.myAtoi("-1"));
    }
}
