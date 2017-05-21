package com.leetcode;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] array = str.split(" ");
        if (pattern.length() != array.length){
            return false;
        }
        Hashtable<Character,String> map = new Hashtable<Character, String>();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))){
                if (!map.get(pattern.charAt(i)).equals(array[i])){
                    return false;
                }
            }
            else {
                if (set.contains(array[i])){

                    return false;
                }
                map.put(pattern.charAt(i),array[i]);
                set.add(array[i]);
            }
        }
        return true;
    }
}
public class WordPattern {
    public static void main(String[] args) {
        Solution290 solution290 = new Solution290();
        String pattern = "abba";
        String str = "dog dog dog dog";
        System.out.println(solution290.wordPattern(pattern,str));
    }
}
