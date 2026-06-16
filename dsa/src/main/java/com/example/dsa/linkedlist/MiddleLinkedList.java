package com.example.dsa.linkedlist;

public class MiddleLinkedList {
    static ListNode head;

    public static void middleOfLinkedList(){
        if(head == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while((fast != null) && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle of Linked List:"+slow.data);

    }

    public static void main(String[] args) {
        head = new ListNode(12);
        head.next = new ListNode(14);
        head.next.next = new ListNode(18);
        head.next.next.next = new ListNode(20);
        head.next.next.next.next = new ListNode(29);
        middleOfLinkedList();
    }
}
