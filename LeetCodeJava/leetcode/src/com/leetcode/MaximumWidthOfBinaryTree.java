package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 2017/8/20.
 */
class Solution662 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxWidth = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            Object[] array = new Object[size*2];
            int index = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null){
                    queue.offer(temp.left);
                    array[index++]=temp.left;
                }else{
                    index++;
                }
                if (temp.right != null){
                    queue.offer(temp.right);
                    array[index++]=temp.right;
                }else{
                    index++;
                }
            }
            int firstNull = 0;
            int lastNull = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null){
                    firstNull = i;
                    break;
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null){
                    lastNull = i;
                }
            }
            maxWidth = Math.max(maxWidth,lastNull-firstNull+1);
        }
        return maxWidth;
    }
}
public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        Solution662 solution662 = new Solution662();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(9);
        System.out.println(solution662.widthOfBinaryTree(root));
    }
}
