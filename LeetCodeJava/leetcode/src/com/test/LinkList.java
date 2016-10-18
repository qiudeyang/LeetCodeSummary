package com.test;

import java.util.Stack;

/**
 * Created by qiudeyang on 17/10/16.
 */
public class LinkList {
    public ListNode head;
    public ListNode current;

    public void add(int data){
        if (head == null){
            head = new ListNode(data);
            current = head;
        }else{
            current.next = new ListNode(data);
            current = current.next;
        }
    }
    public void add(ListNode node){
        if (node == null){
            return;
        }
        if (head == null){
            head = node;
            current = node;
        }else{
            current.next = node;
            current = current.next;
        }
    }
    public void print(ListNode node){
        if (node == null){
            return;
        }
        current = node;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public int getLength(ListNode head){
        if (head == null){
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while (current != null){
            length++;
            current = current.next;
        }
        return length;
    }
    public int findLastKNode(int index){  //index代表的是倒数第index的那个结点
        //第一次遍历，得到链表的长度size
        if (head == null){
            return -1;
        }
        current = head;
        int size = 0;
        while(current != null){
            current = current.next;
            size++;
        }
        //第二次遍历，输出倒数第index个结点的数据
        current = head;
        for (int i = 0; i < size - index ; i++) {
            current = current.next;
        }
        return current.val;
    }
    public ListNode findLastNode(ListNode head,int k){
        if (k == 0 || head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < k - 1; i++) {
            second = second.next;
            if (second == null){
                System.out.println("链表的长度小于k");
                return null;
            }
        }

        while (second.next != null){
            first = first.next;
            second = second.next;
        }
        return first;

    }
    public ListNode findMidNode(ListNode head){
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
    public ListNode mergeLinkList(ListNode head1,ListNode head2){
        if (head1 == null && head2 == null){
            return null;
        }
        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }
        ListNode head;
        ListNode current;
        if (head1.val <= head2.val){
            head = head1;
            current = head1;
            head1 = head1.next;
        }else{
            head = head2;
            current = head2;
            head1 = head2.next;
        }
        while(head1 != null && head2 != null){
            if (head1.val <= head2.val){
                current.next = head1;
                current = current.next;
                head1 = head1.next;
            }else{
                current.next = head2;
                current = current.next;
                head2 = head2.next;
            }
        }
        if (head1 != null){
            current.next = head1;
        }
        if (head2 != null){
            current.next = head2;
        }
        return head;
    }
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode nextNode;
        ListNode reverseHead = null;
        while (current != null){
            nextNode = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = nextNode;
        }
        return reverseHead;
    }
    public void reversePrint(ListNode head){
        if (head == null){
            return;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode current = head;
        while(current != null){
            stack.push(current);
            current = current.next;
        }
        while(!stack.empty()){
            System.out.println(stack.pop().val);
        }
    }
    public void reversePrint1(ListNode head){
        if (head == null){
            return;
        }
        reversePrint1(head.next);
        System.out.println(head.val);
    }
    public boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null){
            first = first.next;
            second = second.next.next;
            if (first == second){
                return true;
            }
        }
        return false;
    }
    public ListNode hasCycle1(ListNode head){
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null){
            first = first.next;
            second = second.next.next;
            if (first == second){
                return first;
            }
        }
        return null;
    }
    public int getCycleLength(ListNode node){
        if (head == null){
            return 0;
        }
        ListNode current = node;
        int length = 0;
        while(current != null){
            current = current.next;
            length++;
            if (current == node){
                return length;
            }
        }
        return length;
    }
    public ListNode getCycleStart(ListNode head,int length){
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < length; i++) {
            second = second.next;
        }
        if (first == second){
            return first;
        }
        while(first != null && second != null){
            first = first.next;
            second = second.next;
            if (first == second){
                return first;
            }
        }
        return null;
    }
    public ListNode getFirstCommonNode(ListNode head1,ListNode head2){
        if (head1 == null || head2 == null){
            return null;
        }
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        int lengthDiff = 0;

        ListNode longHead;
        ListNode shortHead;
        if (length1 > length2){
            longHead = head1;
            shortHead = head2;
            lengthDiff = length1 - length2;
        }else{
            longHead = head2;
            shortHead = head1;
            lengthDiff = length2 - length1;
        }
        for (int i = 0; i < lengthDiff; i++) {
            longHead = longHead.next;
        }
        while (longHead != null && shortHead != null){
            if (longHead == shortHead){
                return longHead;
            }
            longHead = longHead.next;
            shortHead = shortHead.next;
        }
        return null;
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
//        list.add(list.head);
        LinkList list1 = new LinkList();
        for (int i = 3; i < 10; i++) {
            list1.add(i);
        }
        LinkList list2 = new LinkList();
        LinkList list3 = new LinkList();
//        list.print(list.head);
//        System.out.println(list.getLength(list.head));
//        System.out.println(list.findLastKNode(2));
//        System.out.println(list.findLastNode(list.head,2).val);
//        System.out.println(list.findMidNode(list.head).val);
//        list3.head = list2.mergeLinkList(list.head,list1.head);
//        list3.print(list3.head);
//        System.out.println(list.reverseList(list.head).val);
//        list.reversePrint(list.head);
//        list.reversePrint1(list.head);
//        System.out.println(list.hasCycle(list.head));
//        System.out.println(list.getCycleLength(list.head));
//        System.out.println(list.getCycleStart(list.head,10).val);
        System.out.println(list.head.val);
        System.out.println(list1.head.val);
        ListNode node = list2.getFirstCommonNode(list.head,list1.head);
        System.out.println(node.val);
    }
}
