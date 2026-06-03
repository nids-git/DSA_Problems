package com.example.dsa.LRUCache;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

     final int capacity;
     final Map<Integer, DoublyNode> map;
     final DoublyNode head;
     final DoublyNode tail;

    LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();

        // create dummy node
        head = new DoublyNode(0,0);
        tail = new DoublyNode(0,0);

        head.next = tail;
        tail.prev = head;

    }

    public void put(int key, int value){
        if(capacity == 0){
            return;
        }

        // if map contains key - remove it and insertAtStart
        if(map.containsKey(key)){
            DoublyNode node = map.get(key);
            node.value = value;

            removeNode(node);
            insertAtStart(node);
            return;
        }

        if(map.size() == capacity){
            DoublyNode node = tail.prev;
            removeNode(node);
            map.remove(node.key);
        }

        DoublyNode node = new DoublyNode(key, value);
        insertAtStart(node);
        map.put(key, node);

    }

    public void removeNode(DoublyNode node){
        DoublyNode nextNode = node.next;
        DoublyNode prevNode = node.prev;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

    }

    public void insertAtStart(DoublyNode node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;

    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }

        DoublyNode node = map.get(key);
        removeNode(node);
        insertAtStart(node);

        return node.value;
    }

    // For debugging
    public void printCache() {

        DoublyNode temp = head.next;

        while (temp != tail) {
            System.out.print("(" + temp.key + "," + temp.value + ") ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        cache.printCache();

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3); // evicts key 2

        cache.printCache();

        System.out.println(cache.get(2)); // -1

        cache.put(4, 4); // evicts key 1

        cache.printCache();

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}
