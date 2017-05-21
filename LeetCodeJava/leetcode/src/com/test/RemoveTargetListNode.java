package com.test;

/**
 * Created by qiudeyang on 27/04/17.
 */
public class RemoveTargetListNode {
    public static ListNode removeTargetListNode(ListNode node, int target) {
        if (node == null) {
            return node;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = node;
        ListNode current = node;
        ListNode prev = fakeHead;
        while (current != null) {
            if (current.val == target) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        return fakeHead.next;
    }

    public static ListNode removeDuplicate(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode current = node;
        while (current != null){
            ListNode nextNode = current.next;
            if (nextNode == null){
                break;
            }else{
                while (nextNode != null && nextNode.val == current.val){
                    nextNode = nextNode.next;
                }
                if (nextNode == null){
                    current.next = nextNode;
                }
                if (nextNode != null && nextNode.val != current.val){
                    current.next = nextNode;
                }
                current = nextNode;
            }
        }
        return node;
    }

    public static ListNode removeDuplicate1(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode current = node;
        if (current.next != null && current.next.val == current.val) {
            while (current.next != null && current.next.val == current.val) {
                current = current.next;
            }
            return removeDuplicate1(current.next);
        } else {
            current.next = removeDuplicate1(current.next);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);
//        ListNode result1 = removeTargetListNode(node, 2);
//        while (result1 != null) {
//            System.out.print(result1.val + "\t");
//            result1 = result1.next;
//        }

        ListNode result2 = removeDuplicate(node);
        while (result2 != null) {
            System.out.print(result2.val + "\t");
            result2 = result2.next;
        }

//        ListNode result3 = removeDuplicate1(node);
//        while (result3 != null){
//            System.out.print(result3.val+"\t");
//            result3 = result3.next;
//        }
    }
}
