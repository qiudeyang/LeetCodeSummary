package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiudeyang on 03/04/17.
 */
class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        int length = 1;
        Set<String> visited = new HashSet<String>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()){
            if (beginSet.size() > endSet.size()){
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> temp = new HashSet<String>();
            for (String word:beginSet){
                char[] array = word.toCharArray();
                for (int i = 0; i < array.length; i++) {
                    for(char c = 'a'; c <= 'z';c++){
                        char old = array[i];
                        array[i] = c;
                        String target = String.valueOf(array);
                        if (endSet.contains(target)){
                            return length+1;
                        }
                        if (wordList.contains(target) && !visited.contains(target)){
                            temp.add(target);
                            visited.add(target);
                        }
                        array[i]=old;
                    }
                }
            }
            beginSet = temp;
            length++;
        }
        return 0;
    }
}

public class WordLadder {
    public static void main(String[] args) {
        Solution127 solution127 = new Solution127();
        String beiginWord = "hit";
        String endWord = "cog";
        List<String> list = new LinkedList<String>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        System.out.println(solution127.ladderLength(beiginWord, endWord, list));
    }
}
