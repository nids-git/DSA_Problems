package com.example.dsa.linkedlist;

public class LinkedList {
    static ListNode head;

    public static void insertAtStart(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

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

    public static void insertAtEnd(int data){
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }



    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);

        insertAtEnd(0);
        System.out.println();
        displayLinkedList();
        insertAtStart(12);
        System.out.println();
        displayLinkedList();
    }
}
