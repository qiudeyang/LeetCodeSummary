package com.leetcode;

/**
 * Created by qiudeyang on 23/02/17.
 */
class Solution237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //下面是最普遍的情况，测试用例有:链表为空，要删除的结点为空，要删除的结点不在链表中，要删除的结点为头结点、中间结点、尾节点。
    public ListNode deleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) {
            return head;
        }
        ListNode temp = head;
        if (node.val == temp.val) {
            return head.next;
        }
        boolean flag = false;
        while (temp != null) {
            if (temp.val == node.val) {
                if (temp.next != null) {
                    temp.val = temp.next.val;
                    temp.next = temp.next.next;
                    break;
                } else {
                    flag = true;
                    break;
                }
            }
            temp = temp.next;
        }
//        下面是要删除的结点为尾节点的情况，将尾节点置null。
        if (flag){
            temp = head;
            while (temp.next != null && temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
}

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        Solution237 solution237 = new Solution237();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        ListNode result = solution237.deleteNode(node, node.next.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
