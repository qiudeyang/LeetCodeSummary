package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list, Collections.<Integer>reverseOrder());
        return list.get(k-1);
    }

}
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int[] nums = {3,2,1,5,6,4};
        System.out.println(solution215.findKthLargest(nums,2));
    }
}
