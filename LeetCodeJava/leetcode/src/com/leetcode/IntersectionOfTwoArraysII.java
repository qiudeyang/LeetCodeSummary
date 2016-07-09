package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 13/06/16.
 */
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int index = 0;
        for (; i < nums1.length && j <nums2.length; ) {
                if (nums1[i] == nums2[j]){
                    nums3[index++] = nums1[i];
                    i++;
                    j++;
                }else if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
            }
        int[] nums4 = new int[index];
        System.arraycopy(nums3,0,nums4,0,index);
        for (int k = 0; k < nums4.length ; k++) {
            System.out.println(nums4[k]);
        }
        return nums4;
    }
}
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        Solution350 solution350 = new Solution350();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(solution350.intersect(nums1,nums2));
    }
}
