package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 29/10/16.
 */
class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null){
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> list = new LinkedList<Integer>();  //每到一级就会清空
            for (int i = 0; i < levelNum; i++) {   //当前级有多少个节点，levelNum就为多少
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                list.add(queue.poll().val);
            }
            result.add(list);
        }
        return result;
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
