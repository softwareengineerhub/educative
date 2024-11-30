package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUConstantTime {
    private int capacity;
    private Map<String, Node> cache;
    private Node head;
    private Node tail;

    public LRUConstantTime(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public Object put(String key, Object value) {
        Node node = cache.get(key);
        Object oldValue = node == null ? null : node.value;
        if (node != null) {
            node.value = value;
            moveToHead(node);
            return oldValue;
        }

        if (cache.size() == capacity) {
            Node nodeToRemove = tail.prev;
            cache.remove(nodeToRemove.key);
            removeNode(nodeToRemove);
        }
        Node newNode = new Node(key, value);
        addToHead(newNode);
        cache.put(key, newNode);
        return oldValue;

    }

    public Object get(String key) {
        Node node = cache.get(key);
        if (node == null) {
            return null;
        }
        moveToHead(node);
        return node.value;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next = node;
        head.next.prev = node;
    }


    private class Node {
        private String key;
        private Object value;
        private Node prev;
        private Node next;

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Node() {

        }

    }

    public static void main(String[] args) {
        LRUConstantTime cache = new LRUConstantTime(2); // capacity of 2
        cache.put("1", 1);
        cache.put("2", 2);
        Object value =  cache.get("1");       // returns 1
        System.out.println("value=" + value);
        Object value2 =  cache.get("2");       // returns 1
        System.out.println("value2=" + value2);
        cache.put("3", 3);    // evicts key 2
        value = cache.get("1");
        System.out.println("value=" + value);
    }

}
