package com.leetcode;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution8 {
    public boolean validString = true;
    public boolean isMinus = false;
    public int myAtoi(String str) {
        if (str == null || str.length() == 0){
            validString = false;
            return 0;
        }
        int index = 0;
        long result = 0;
        while (str.charAt(index) == ' '){
            index++;
        }
        if (str.charAt(index)=='+'){
            result = myAtoiCore(str,index+1,str.length()-1,isMinus);
        }else if (str.charAt(index)=='-'){
            isMinus = true;
            result = myAtoiCore(str,index+1,str.length()-1,isMinus);
        }else{
            result = myAtoiCore(str,index,str.length()-1,isMinus);
        }
        return (int)result;
    }

    public long myAtoiCore(String str,int start,int end,boolean isMinus){
        if (start > end){
            validString = false;
            return 0;
        }
        long number = 0;
        int flag = 1;
        if (isMinus){
            flag = -1;
        }
        int i = start;
        while (i <= end){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                number = number * 10 + flag * (str.charAt(i)-'0');
                if (!isMinus && number > Integer.MAX_VALUE){  //超过上界，返回2147483647
                    return Integer.MAX_VALUE;
                }
                if(isMinus && number < Integer.MIN_VALUE){   //超过下界，返回-2147483648
                    return Integer.MIN_VALUE;
                }
                i++;
            }else{
                return number;  //看前面的
            }
        }
        return number;
    }
}

public class StringToInteger {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(solution.myAtoi("+-2"));
    }
}
