package com.leetcode;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null){
            return null;
        }
        TreeNode head = helper(nums,0,nums.length-1);
        return head;
    }
    public TreeNode helper(int[] nums,int low,int high){
        if (low > high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,low,mid-1);
        node.right = helper(nums,mid+1,high);
        return node;
    }
}

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution108 solution108 = new Solution108();
        int[] nums = {1, 3, 5, 7, 8, 11};
        System.out.println(solution108.sortedArrayToBST(nums).val);
    }
}
