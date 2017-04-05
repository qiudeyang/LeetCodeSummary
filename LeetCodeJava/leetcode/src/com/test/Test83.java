package com.test;

/**
 * Created by qiudeyang on 03/04/17.
 */
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode result = head;
        ListNode temp = result;
        ListNode current = head;
        ListNode nextNode;
        while(current != null){
            nextNode = current.next;
            while(nextNode != null && nextNode.val == current.val){
                current = nextNode;
                nextNode = current.next;
            }
            if(nextNode != null && nextNode.val != current.val){
                temp.next = nextNode;
                temp = temp.next;
                current = nextNode;
                nextNode = current.next;
            }
        }
        return result;
    }
}
public class Test83 {
    public static void main(String[] args) {
        Solution83 solution83 = new Solution83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
//        ListNode result = solution83.deleteDuplicates(head);
//        while (result != null){
//            System.out.println(result.val);
//            result = result.next;
//        }
        String a = "123";
        String b = "123";
        String c = new String("123");
        System.out.println("a==b"+a==b);
        System.out.println("a==c"+a==c);
        int[] nums = {1,2,3,4,5};
        for (int n:nums) {
            System.out.println(n);
        }
    }
}
