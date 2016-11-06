package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 06/11/16.
 */
class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        List<Integer> currentList = new LinkedList<Integer>();
        pathSum(root,sum,currentList,list);
        return list;
    }
    public void pathSum(TreeNode root,int sum,List<Integer> currentList,List<List<Integer>> list){
        if (root == null){
            return;
        }
        currentList.add(root.val);
        if (root.left == null && root.right == null && sum == root.val){
            list.add(new LinkedList<Integer>(currentList));
            currentList.remove(currentList.size()-1);
            return;
        }else{
            pathSum(root.left,sum-root.val,currentList,list);
            pathSum(root.right,sum-root.val,currentList,list);
        }
        currentList.remove(currentList.size()-1);
    }

    List<List<Integer>> result = new LinkedList<List<Integer>>();
    public List<List<Integer>> pathSum1(TreeNode root, int sum) {
        helper(new LinkedList<Integer>(),root,sum);
        return result;
    }
    public void helper(List<Integer> list,TreeNode root,int sum){
        if (root == null){
            return;
        }
        list.add(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null){
            if (sum == 0){
                result.add(list);
            }
            return;
        }
        helper(new LinkedList<Integer>(list),root.left,sum);
        helper(new LinkedList<Integer>(list),root.right,sum);
    }
}

public class PathSumII {
    public static void main(String[] args) {
        Solution113 solution113 = new Solution113();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        System.out.println(solution113.pathSum1(root, 22));
    }
}
