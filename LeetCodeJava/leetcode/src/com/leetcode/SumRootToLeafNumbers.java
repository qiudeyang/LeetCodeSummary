package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 05/11/16.
 */
class Solution129 {
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root,int s){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return s*10+root.val;
        }
        return sum(root.left,s*10+root.val)+sum(root.right,s*10+root.val);
    }
    public int sumNumbers1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<String> list = new LinkedList<String>();
        searchBinaryTree(root,"",list);
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += Integer.parseInt(list.get(i));
        }
        return result;
    }
    public void searchBinaryTree(TreeNode root,String path,List<String> list){
        if (root.left == null && root.right == null){
            list.add(path+root.val);
        }
        if (root.left != null){
            searchBinaryTree(root.left,path+root.val,list);
        }
        if (root.right != null){
            searchBinaryTree(root.right,path+root.val,list);
        }
    }
}

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        Solution129 solution129 = new Solution129();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution129.sumNumbers(root));
    }
}
