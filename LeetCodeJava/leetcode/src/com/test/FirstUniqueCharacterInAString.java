package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 09/10/16.
 */
class Solution387 {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        List<Character> list = new LinkedList<Character>();
        int[] array = new int[26];
        for(int i = 0;i < s.length();i++){
            array[s.charAt(i)-'a']++;
        }
        for(int i = 0;i < array.length;i++){
            if(array[i] == 1){
                list.add((char) (i+'a'));
            }
        }
        for(int i = 0;i < s.length();i++){
            if(list.contains(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution387 solution387 = new Solution387();
        String s = "loveleetcode";
        System.out.println(solution387.firstUniqChar(s));
    }
}
