package com.leetcode;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        int indexS = 0;
        int indexT = 0;
        while (indexT < t.length()){
            if (s.charAt(indexS) == t.charAt(indexT)){
                indexS++;
                if (indexS == s.length()){
                    return true;
                }
            }
            indexT++;
        }
        return false;
    }
    public boolean isSubsequence1(String s, String t) {
        if (s.length() > t.length()){
            return false;
        }
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            prev = t.indexOf(temp,prev);
            if (prev == -1){
                return false;
            }
            prev++;
        }
        return true;
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        Solution392 solution392 = new Solution392();
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(solution392.isSubsequence1(s, t));
    }
}
