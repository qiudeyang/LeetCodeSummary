package com.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Solution116 {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode pre = root;
        TreeLinkNode cur = null;
        while (pre.left != null){
            cur = pre;
            while (cur != null){
                cur.left.next = cur.right;
                if (cur.next != null){
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            pre = pre.left;
        }
    }
}

public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        Solution116 solution116 = new Solution116();
        solution116.connect(new TreeLinkNode());
    }
}
