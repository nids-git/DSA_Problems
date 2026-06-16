package com.example.dsa.linkedlist;

public class DetectCyclicLoopList {
    static ListNode head;

    public static boolean isCyclicLoop(){
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while((fast != null) && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        head = new ListNode(12);
        head.next = new ListNode(14);
        head.next.next = new ListNode(18);
        head.next.next.next = new ListNode(20);
        head.next.next.next.next = new ListNode(29);
        head.next.next.next.next = head.next;

        boolean isLoopDetected = isCyclicLoop();
        System.out.println("Linked list has cycle - "+isLoopDetected);
    }
}
