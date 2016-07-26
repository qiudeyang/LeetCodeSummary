package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/06/16.
 */
class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        for (int i = 0; i < nums.length ; i++) {

        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val){
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            nums[i] =list.get(i);
        }

        return list.size();
    }
}
public class RemoveElement {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] nums = {3,2,2,3};
        System.out.println("nihaoa"+solution27.removeElement(nums,3));
    }
}
