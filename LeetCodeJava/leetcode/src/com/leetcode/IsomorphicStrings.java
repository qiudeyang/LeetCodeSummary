package com.leetcode;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character,Character> ht = new Hashtable<Character, Character>();
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (ht.containsKey(sc)){
                if(tc != ht.get(sc)){
                    return false;
                }
            }else{
                if(hs.contains(tc)){
                    return false;
                }
                ht.put(sc,tc);
                hs.add(tc);
            }
        }
        return true;
    }
}
public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution205 solution205 = new Solution205();
        String s = "egg";
        String t = "add";
        System.out.println(solution205.isIsomorphic(s,t));
    }
}
