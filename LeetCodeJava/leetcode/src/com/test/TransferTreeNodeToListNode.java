package com.test;

/**
 * Created by qiudeyang on 16/04/17.
 */
public class TransferTreeNodeToListNode {
    public static ListNode helper(TreeNode root){
        if (root == null){
            return null;
        }
        ListNode result = new ListNode(root.val);
        result.next = helper(root.right);
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        ListNode result = helper(root);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
