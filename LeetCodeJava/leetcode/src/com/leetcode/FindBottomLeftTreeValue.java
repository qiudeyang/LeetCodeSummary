package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qiudeyang on 14/02/17.
 */
class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode result = null;
        while (!queue.isEmpty()){
            result = queue.peek();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null){
                    queue.offer(temp.left);
                }
                if (temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
        return result.val;
    }
}

public class FindBottomLeftTreeValue {
    public static void main(String[] args) {
        Solution513 solution513 = new Solution513();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(solution513.findBottomLeftValue(root));
    }
}
