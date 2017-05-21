package com.leetcode;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Solution337 {
    public int rob(TreeNode root) {
        Map<TreeNode,Integer> map = new Hashtable<TreeNode, Integer>();
        return robSub(root,map);
    }
    public int robSub(TreeNode root,Map<TreeNode,Integer> map){
        if (root == null){
            return 0;
        }
        if (map.containsKey(root)){
            return map.get(root);
        }
        int val = 0;
        if (root.left != null){
            val += robSub(root.left.left,map)+robSub(root.left.right,map);
        }
        if (root.right != null){
            val += robSub(root.right.left,map)+robSub(root.right.right,map);
        }
        val = Math.max(val+root.val,robSub(root.left,map)+robSub(root.right,map));
        map.put(root,val);
        return val;
    }
}

public class HouseRobberIII {
    public static void main(String[] args) {
        Solution337 solution337 = new Solution337();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        System.out.println(solution337.rob(root));
    }
}
