package com.leetcode;

/**
 * Created by qiudeyang on 29/10/16.
 */
class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0){
            root = root.val > p.val ? root.left:root.right;
        }
        return root;
    }
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < Math.min(p.val,q.val)){
            return lowestCommonAncestor1(root.right,p,q);
        }
        if (root.val > Math.max(p.val,q.val)){
            return lowestCommonAncestor1(root.left,p,q);
        }
        return root;
    }

}

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        Solution235 solution235 = new Solution235();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println(solution235.lowestCommonAncestor1(root, new TreeNode(2), new TreeNode(8)).val);
    }
}
