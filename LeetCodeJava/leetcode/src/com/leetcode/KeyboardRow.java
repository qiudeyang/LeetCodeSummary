package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiudeyang on 09/02/17.
 */
class Solution500 {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String[] strs = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i] == " "){
                continue;
            }
            int index = map.get(words[i].toUpperCase().charAt(0));
            for (char c:words[i].toUpperCase().toCharArray()){
                if (map.get(c) != index){
                    index = -1;
                    break;
                }
            }
            if (index != -1){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}

public class KeyboardRow {
    public static void main(String[] args) {
        Solution500 solution500 = new Solution500();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = solution500.findWords(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
