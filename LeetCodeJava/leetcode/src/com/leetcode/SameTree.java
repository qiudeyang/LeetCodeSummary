package com.leetcode;

/**
 * Created by qiudeyang on 15/10/16.
 */
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if (p == null && q == null){
            return true;
        }
        if (p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }


    }
}
public class SameTree {
    public static void main(String[] args) {
        Solution100 solution100 = new Solution100();
        TreeNode tn1 = new TreeNode(1);
        tn1.left = new TreeNode(2);
        tn1.right = new TreeNode(3);
        TreeNode tn2 = new TreeNode(1);
        tn2.left = new TreeNode(4);
        tn2.right = new TreeNode(3);
        System.out.println(solution100.isSameTree(tn1,tn2));

    }
}
