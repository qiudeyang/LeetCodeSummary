package com.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 05/05/17.
 */
class Solution524 {
    public String findLongestWord(String s, List<String> d) {
        if (s == null || s.length() < 1 || d == null || d.size() < 1) {
            return "";
        }
        Collections.sort(d, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        for (String words : d) {
            int index = 0;
            for (char c : s.toCharArray()) {
                if (index < words.length() && c == words.charAt(index)) {
                    index++;
                }
            }
            if (index == words.length()) {
                return words;
            }
        }
        return "";
    }
}

public class LongestWordInDictionaryThroughDeleting {
    public static void main(String[] args) {
        Solution524 solution524 = new Solution524();
        List<String> d = new LinkedList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        List<String> d1 = new LinkedList<>();
        d1.add("b");
        d1.add("c");
        d1.add("a");
        System.out.println(solution524.findLongestWord("abpcplea", d));
        System.out.println(solution524.findLongestWord("abpcplea", d1));
    }
}
