package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by qiudeyang on 04/06/17.
 */
class Solution609 {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        for(String path:paths){
            String[] tokens = path.split(" ");
            for (int i = 1; i < tokens.length; i++) {
                String file = tokens[i].substring(0,tokens[i].indexOf("("));
                String content = tokens[i].substring(tokens[i].indexOf("(")+1,tokens[i].indexOf(")"));
                map.putIfAbsent(content,new ArrayList<>());
                map.get(content).add(tokens[0]+"/"+file);
            }
        }
        return map.values().stream().filter(e->e.size()>1).collect(Collectors.toList());
    }
}

public class FindDuplicateFileInSystem {
    public static void main(String[] args) {
        Solution609 solution609 = new Solution609();
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(solution609.findDuplicate(paths));
    }
}
