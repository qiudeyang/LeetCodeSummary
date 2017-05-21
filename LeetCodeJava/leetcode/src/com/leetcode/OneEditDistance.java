package com.leetcode;

/**
 * Created by qiudeyang on 16/03/17.
 */
//阿里蚂蚁金服一面编程题，可惜之前只做了Edit Distance，当时没写出来，感觉不够冷静，现在想想，稍微冷静下的话
// 是没问题的，重点还是在思路。
class Solution161 {
    public boolean isOneEditDistance(String s, String t) {
         if (Math.abs(s.length()-t.length()) > 1){
             return false;
         }else if(s.length() == t.length()){
             return isSameLength(s,t);
         }else if (s.length() < t.length()){
             return isOneLeft(s,t);
         }else{
             return isOneLeft(t,s);
         }
    }

    public boolean isSameLength(String s,String t){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==t.charAt(i)){
                continue;
            }
            count++;
        }
        return count==1;
    }

    public boolean isOneLeft(String s,String t){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==t.charAt(i)){
                continue;
            }
            return s.substring(i)==t.substring(i+1);
        }
        return true;
    }

}

public class OneEditDistance {
    public static void main(String[] args) {
        Solution161 solution161 = new Solution161();
        String s = "abcd";
        String t = "adc";
        System.out.println(solution161.isOneEditDistance(s, t));
    }
}
