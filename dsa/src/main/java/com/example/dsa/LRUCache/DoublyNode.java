package com.example.dsa.LRUCache;

public class DoublyNode {
    int key;
    int value;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}
