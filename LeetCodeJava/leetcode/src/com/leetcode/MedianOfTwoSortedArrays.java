package com.leetcode;

/**
 * Created by qiudeyang on 04/05/17.
 */
class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (helper(nums1, 0, nums2, 0, l) + helper(nums1, 0, nums2, 0, r)) / 2;
    }

    public double helper(int[] nums1, int aStart, int[] nums2, int bStart, int k) {
        if (aStart > nums1.length - 1) {
            return nums2[bStart + k - 1];
        }
        if (bStart > nums2.length - 1) {
            return nums1[aStart + k - 1];
        }
        if (k==1){
            return Math.min(nums1[aStart],nums2[bStart]);
        }
        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;
        if (aStart+k/2-1<nums1.length){
            aMid = nums1[aStart+k/2-1];
        }
        if (bStart+k/2-1<nums2.length){
            bMid = nums2[bStart+k/2-1];
        }
        if (aMid<bMid){
            return helper(nums1,aStart+k/2,nums2,bStart,k-k/2);
        }else{
            return helper(nums1,aStart,nums2,bStart+k/2,k-k/2);
        }
    }
}

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println(solution4.findMedianSortedArrays(nums1, nums2));
    }
}
