package com.leetcode;

/**
 * Created by qiudeyang on 04/06/17.
 */
class Solution606 {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        if (t == null) {
            return "";
        } else if (t.left == null && t.right == null) {
            sb.append(t.val);
            return sb.toString();
        } else if (t.left != null && t.right == null) {
            sb.append(t.val);
            sb.append("(").append(tree2str(t.left)).append(")");
            return sb.toString();
        } else if (t.left == null && t.right != null) {
            sb.append(t.val);
            sb.append("(").append(")").append("(").append(tree2str(t.right)).append(")");
            return sb.toString();
        } else {
            sb.append(t.val);
            sb.append("(").append(tree2str(t.left)).append(")");
            sb.append("(").append(tree2str(t.right)).append(")");
            return sb.toString();
        }
    }
}

public class ConstructStringFromBinaryTree {
    public static void main(String[] args) {
        Solution606 solution606 = new Solution606();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(solution606.tree2str(root));
    }
}
