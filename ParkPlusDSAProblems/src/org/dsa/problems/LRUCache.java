package org.dsa.problems;

import java.util.*;

public class LRUCache {
    //TC: O(1) for get & put method in average case (worst case: O(logN))
    //SC: O(N * 5)
    //Required Node class for doubly linked list
    class Node {
        Node prev;
        Node next;
        int key;
        int val;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    //two dummy nodes at both side as Head & Tail of Doubly linked list.
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    Map<Integer, Node> hmap = new HashMap<>();
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        //connecting head & prev initially
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hmap.containsKey(key)) {
            Node node = hmap.get(key);
            delete(node);
            insert(node);
            return node.val;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hmap.containsKey(key)) {
            delete(hmap.get(key));
        }
        if(hmap.size() == this.capacity) {
            delete(tail.prev);
        }
        insert(new Node(key, value));
    }
    
    private void insert(Node node) {
        //insert (key, address)into a map
        hmap.put(node.key, node);
        //changing links of pointers
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
    
    private void delete(Node node) {
        hmap.remove(node.key);
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
