package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiudeyang on 21/10/16.
 */
class Solution318 {
    public int maxProduct(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length - 1; i++) {
            Set<Character> set = toSet(words[i]);
            for (int j = i+1; j < words.length; j++) {
                if (!hasCommonCharacter(set,words[j])){
                   int temp = words[i].length() * words[j].length();
                    if (temp > result){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
    public static Set<Character> toSet(String s){
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set;
    }
    public static boolean hasCommonCharacter(Set<Character> set,String s){
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length;i++) {
            if (set.contains(array[i])){
                return true;
            }
        }
        return false;
    }
}
public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        Solution318 solution318 = new Solution318();
        String[] words = {"a", "aa", "aaa", "aaaa"};
        System.out.println(solution318.maxProduct(words));
    }
}
