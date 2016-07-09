package com.test;

/**
 * Created by qiudeyang on 18/06/16.
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (Arrays.binarySearch(nums2,nums1[i]) < nums2.length && Arrays.binarySearch(nums2,nums1[i]) >= 0){
                list.add(nums1[i]);
            }
        }
        int[] nums3 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums3[i]=list.get(i);
        }
        return nums3;
    }
}

public class TestIntersectionofTwoArraysII {
    public static void main(String[] args) {

    }
}
