package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LRUConstantTimeConcurr {

    private int capacity;
    private Map<String, Node> cache;
    private Node head;
    private Node tail;
    private ReentrantReadWriteLock lock;


    public LRUConstantTimeConcurr(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        lock = new ReentrantReadWriteLock();
    }

    public Object put(String key, Object value) {
        lock.writeLock().lock();
        try {
            Node node = cache.get(key);
            Object oldValue = node == null ? null : node.value;
            if (node != null) {
                node.value = value;
                //cache.put(key, node);
                moveToHead(node);
                return oldValue;
            }

            if (cache.size() == capacity) {
                Node toRemoveNode = tail.prev;
                cache.remove(toRemoveNode.key);
                remove(toRemoveNode);
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            return oldValue;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public Object get(String key) {
        lock.readLock().lock();
        try {
            Node node = cache.get(key);
            if (node == null) {
                return null;
            }
            lock.writeLock();
            try {
                moveToHead(node);
                return node.value;
            } finally {
                lock.writeLock().unlock();
            }
        } finally {
            lock.readLock().unlock();
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(Node node) {
        Node tmp = head.next;
        head.next = node;
        node.next = tmp;
        tmp.prev = node;
        node.prev = head;
    }

    private void moveToHead(Node node) {
        remove(node);
        addToHead(node);
    }

    private class Node {
        private Node prev;
        private Node next;
        private String key;
        private Object value;

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Node() {

        }
    }

    public static void main(String[] args) {
        LRUConstantTimeConcurr cache = new LRUConstantTimeConcurr(2); // capacity of 2
        cache.put("1", 1);
        cache.put("2", 2);
        Object value = cache.get("1");       // returns 1
        System.out.println("value=" + value);
        cache.put("3", 3);    // evicts key 2
        Object value2 = cache.get("2");
        System.out.println("value2=" + value2);
    }
}
