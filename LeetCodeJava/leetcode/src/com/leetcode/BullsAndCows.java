package com.leetcode;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 27/10/16.
 */
class Solution299 {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }
        }
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            array1[secret.charAt(i) - '0']++;
        }
        for (int i = 0; i < guess.length(); i++) {
            array2[guess.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(array1[i], array2[i]);
        }
        cow = cow - bull;
        return bull + "A" + cow + "B";
    }
}

public class BullsAndCows {
    public static void main(String[] args) {
        Solution299 solution299 = new Solution299();
        String secret = "1123";
        String guess = "0111";
        System.out.println(solution299.getHint(secret, guess));
    }
}
