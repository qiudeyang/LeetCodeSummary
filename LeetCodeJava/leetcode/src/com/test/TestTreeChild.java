package com.test;

/**
 * Created by qiudeyang on 16/10/16.
 */

public class TestTreeChild {
    public boolean hasSameNode(TreeNode root1,TreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }else {
            return hasSameNode(root1.left,root2.left) && hasSameNode(root1.right,root2.right);
        }
    }
    public boolean isSubTree(TreeNode node1,TreeNode node2){
        boolean result = false;
        if (node1 != null && node2 != null){
            if (node1.val == node2.val){
                result = hasSameNode(node1,node2);
            }
            if (!result){
                result = isSubTree(node1.left,node2);
            }
            if (!result){
                result = isSubTree(node1.right,node2);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(10);
        root1.left.left = new TreeNode(2);
        root1.right.left = new TreeNode(9);

        TreeNode root2 = new TreeNode(8);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(10);

        TreeNode root3 = new TreeNode(4);
        root1.left = new TreeNode(2);

        System.out.println(new TestTreeChild().isSubTree(root1,root3));

    }
}
