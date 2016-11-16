package com.leetcode;

/**
 * Created by qiudeyang on 15/11/16.
 */
class Solution275 {
    public int hIndex(int[] citations) {
        int low = 0;
        int length = citations.length;
        int high = citations.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (citations[mid] == length - mid) {
                return citations[mid];
            } else if (citations[mid] < length - mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return length - (high + 1);
    }
}

public class HIndexII {
    public static void main(String[] args) {
        Solution275 solution275 = new Solution275();
        int[] citations = {};
        System.out.println(solution275.hIndex(citations));
    }
}
