package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 16/12/16.
 */
class Solution102 {
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
        }
        return list;
    }
}
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution102 solution102 = new Solution102();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution102.levelOrder(root));
    }
}
