package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 06/11/16.
 */
class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<String>();
        if (root != null){
            searchBinaryTree(root,"",list);
        }
        return list;
    }
    public void searchBinaryTree(TreeNode root,String path,List<String> list){
        if (root.left == null && root.right == null){
            list.add(path+root.val);
        }
        if (root.left != null){
            searchBinaryTree(root.left,path+root.val+"->",list);
        }
        if (root.right != null){
            searchBinaryTree(root.right,path+root.val+"->",list);
        }
    }
    public List<String> binaryTreePaths1(TreeNode root) {
        List<String> list = new LinkedList<String>();
        DFS(root,"",list);
        return list;
    }
    public void DFS(TreeNode root,String Path,List<String> list){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            list.add(Path+root.val);
        }
        DFS(root.left,Path+root.val+"->",list);
        DFS(root.right,Path+root.val+"->",list);
    }
}
public class BinaryTreePaths {
    public static void main(String[] args) {
        Solution257 solution257 = new Solution257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(solution257.binaryTreePaths(root));
    }
}
