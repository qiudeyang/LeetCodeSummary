package com.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 19/04/17.
 */
//合并区间
class Solution56 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new LinkedList<>();
        if (intervals == null || intervals.size() < 1) {
            return result;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Interval prev = null;
        for (Interval item:intervals){
            if (prev == null || prev.end < item.start){
                result.add(item);
                prev = item;
            }else if (prev.end < item.end ){
                prev.end = item.end;
            }
        }
        return result;
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();

    }
}
