package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 09/10/16.
 */
class Solution3871 {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        for(int i = 0;i <s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
public class FirstUniqueCharacterInAString1 {
    public static void main(String[] args) {
        Solution387 solution387 = new Solution387();
        String s = "loveleetcode";
        System.out.println(solution387.firstUniqChar(s));
    }
}
