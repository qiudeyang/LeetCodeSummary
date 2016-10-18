package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 17/10/16.
 */
class Solution401 {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i*64 + j) == num){
                    String time = String.format("%d:%02d",i,j);
                    list.add(time);
                }
            }

        }
        return list;

    }
}
public class BinaryWatch {
    public static void main(String[] args) {
        Solution401 solution401 = new Solution401();
        System.out.println(solution401.readBinaryWatch(1));
    }
}
