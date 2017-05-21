package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 24/10/16.
 */
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
//       StringBuilder result = new StringBuilder();
//        if (strs != null && strs.length > 0){
//            Arrays.sort(strs);
//            char[] array1 = strs[0].toCharArray();
//            char[] array2 = strs[strs.length-1].toCharArray();
//            for (int i = 0; i < array1.length; i++) {
//                if (array2.length > i && array2[i]==array1[i]){  //array2.length > i防止出现空指针异常
//                    result.append(array1[i]);
//                }else{
//                    return result.toString();
//                }
//            }
//        }
//        return result.toString();
        if (strs == null || strs.length < 1){
            return null;
        }
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(temp) != 0){          //确保temp都是每一个字符串的前缀
                temp = temp.substring(0,temp.length()-1);
            }
        }
        return temp;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] strs = {"ac","ab"};
        System.out.println(solution14.longestCommonPrefix(strs));
    }
}
