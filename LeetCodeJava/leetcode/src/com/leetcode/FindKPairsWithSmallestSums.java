package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 20/05/17.
 */
class Solution373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new LinkedList<int[]>();
        if (nums1 == null || nums1.length < 1 || nums2 == null || nums2.length < 1 || k < 1) {
            return list;
        }
        for (int index1 = 0; index1 < nums1.length; index1++) {
            for (int index2 = 0; index2 < nums2.length; index2++) {
                list.add(new int[]{nums1[index1], nums2[index2]});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int sum1 = o1[0] + o1[1];
                int sum2 = o2[0] + o2[1];
                return sum1 - sum2;
            }
        });
        List<int[]> result = new LinkedList<int[]>();
        for (int i = 0; i < k && i < list.size(); i++) {
            result.add(list.get(i));
        }
        return result;
    }

    //以下方法使用优先队列，时间复杂度是O(klogk)
    public List<int[]> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new LinkedList<int[]>();
        if (nums1 == null || nums1.length < 1 || nums2 == null || nums2.length < 1 || k < 1) {
            return list;
        }
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        for (int i = 0; i < nums1.length && i < k; i++) {
            queue.offer(new int[]{nums1[i], nums2[0], 0});
        }
        while (k-- > 0 && !queue.isEmpty()) {
            int[] temp = queue.poll();
            list.add(new int[]{temp[0], temp[1]});
            if (temp[2] == nums2.length - 1) {
                continue;
            }
            queue.offer(new int[]{temp[0], nums2[temp[2] + 1], temp[2] + 1});
        }
        return list;
    }
}

public class FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        Solution373 solution373 = new Solution373();
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        List<int[]> result = solution373.kSmallestPairs(nums1, nums2, 3);
        for (int i = 0; i < result.size(); i++) {
            int[] temp = result.get(i);
            System.out.println(temp[0] + "\t" + temp[1]);
        }
        List<int[]> result1 = solution373.kSmallestPairs1(nums1, nums2, 3);
        for (int i = 0; i < result.size(); i++) {
            int[] temp1 = result1.get(i);
            System.out.println(temp1[0] + "\t" + temp1[1]);
        }
    }


}
