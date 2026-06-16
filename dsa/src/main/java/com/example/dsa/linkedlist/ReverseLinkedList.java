package com.example.dsa.linkedlist;

public class ReverseLinkedList {
    static ListNode head;

    public static void displayLinkedList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
    }

    public static void reverseLinkedList(){
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);

        System.out.println("Linked List");
        displayLinkedList();
        reverseLinkedList();
        System.out.println();
        System.out.println("Reverse Linked List");
        displayLinkedList();

    }
}
