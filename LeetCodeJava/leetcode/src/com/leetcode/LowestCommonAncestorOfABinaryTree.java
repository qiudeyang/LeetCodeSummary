package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 26/02/17.
 */
class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        Stack<TreeNode> stackP = new Stack<TreeNode>();
        Stack<TreeNode> stackQ = new Stack<TreeNode>();
        getPath(root, p, stackP);
        getPath(root, q, stackQ);
        TreeNode result = null;
        while (!stackP.isEmpty() && !stackQ.isEmpty() && stackP.peek() == stackQ.peek()) {
            result = stackP.peek();
            stackP.pop();
            stackQ.pop();
        }
        return result;
    }

    public static boolean getPath(TreeNode root, TreeNode p, Stack<TreeNode> stackP) {
        if (root == null || p == null) {
            return false;
        }
        if (root == p) {
            stackP.push(root);
            return true;
        } else {
            if (getPath(root.left, p, stackP) || getPath(root.right, p, stackP)) {
                stackP.push(root);
                return true;
            } else {
                return false;
            }
        }
    }

    //   递归方式
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor1(root.left, p, q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        return right;
    }

    //遍历方式
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        map.put(root, null);
        stack.push(root);
        while (!map.containsKey(p) || !map.containsKey(q)) {
            TreeNode temp = stack.pop();
            if (temp.left != null){
                map.put(temp.left,temp);
                stack.push(temp.left);
            }
            if (temp.right != null){
                map.put(temp.right,temp);
                stack.push(temp.right);
            }
        }
        List<TreeNode> list = new LinkedList<>();
        while (p != null){
            list.add(p);
            p = map.get(p);
        }
        while (!list.contains(q)){
            q = map.get(q);
        }
        return q;
    }

}

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        System.out.println(new Solution236().lowestCommonAncestor(root, root.left, root.left.right.right).val);
        System.out.println(new Solution236().lowestCommonAncestor2(root, root.left, root.left.right.right).val);
    }
}
