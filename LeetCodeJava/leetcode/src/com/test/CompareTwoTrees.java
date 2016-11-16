package com.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by qiudeyang on 13/11/16.
 */
public class CompareTwoTrees {
    public boolean theSameTree(TreeNode root1,TreeNode root2){
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            return false;
        }
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1.val != root2.val){
            return false;
        }else{
            return theSameTree(root1.left,root2.left) && theSameTree(root1.right,root2.right);
        }
    }
    public static void main(String[] args) {
        CompareTwoTrees ctt = new CompareTwoTrees();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(4);
//        System.out.println(ctt.theSameTree(root1,root2));
        String a = "abc";
        String b = "bbc";
//        System.out.println(a.compareTo(b));

    }
}
