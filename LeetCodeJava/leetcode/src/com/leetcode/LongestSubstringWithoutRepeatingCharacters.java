package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 14/04/17.
 */
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int start = 0;
        int result = 1;
        Map<Character,Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end))+1);
            }
            map.put(s.charAt(end),end);
            result = Math.max(result,end-start+1);
        }
        return result;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));
    }
}
