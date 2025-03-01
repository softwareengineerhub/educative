package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class LRUTestConstantTime {
    private Map<MiNode, Object> cache = new HashMap<>();
    private int capacity;
    private MiNode head;
    private MiNode tail;


    public LRUTestConstantTime(int capacity) {
        this.capacity = capacity;
        this.head = new MiNode("HEAD");
        this.tail = new MiNode("TAIL");
        head.next = tail;
        tail.prev = head;
    }

    public Object put(String key, Object value) {
        MiNode node = new MiNode(key);

        if (cache.size() == capacity) {
            if (!cache.containsKey(node)) {
                evict();
            }
        }
        addToHead(node);
        return cache.put(node, value);
    }

    public Object get(String key) {
        MiNode node = new MiNode(key);
        Object value = cache.get(node);
        if (value == null) {
            return null;
        }
        remove(tail.prev);
        addToHead(node);
        return node.value;
    }

    private void evict() {
        MiNode node = tail.prev;
        if (node == null) {
            return;
        }
        remove(node);
        cache.remove(node);
    }

    public static void main(String[] args) {
        LRUTestConstantTime cache = new LRUTestConstantTime(2); // capacity of 2
        cache.put("1", 1);
        cache.put("2", 2);
        Object value = cache.get("1");       // returns 1
        System.out.println("value=" + value);
        cache.put("3", 3);    // evicts key 2
        Object value2 = cache.get("2");
        System.out.println("value2=" + value2);
        Object value3 = cache.get("3");
        System.out.println("value3=" + value3);
    }

    private void addToHead(MiNode node) {
        MiNode first = head.next;
        head.next = node;
        node.prev = head;
        if (first != null) {
            first.prev = node;
            node.next = first;
        }
    }

    private void remove(MiNode node) {
        MiNode a = node.prev;
        MiNode b = node.next;
        if (a != null) {
            a.next = b;
        }
        if (b != null) {
            b.prev = a;
        }
    }

    private class MiNode {
        private Object value;
        private MiNode prev;
        private MiNode next;

        public MiNode(Object value) {
            this.value = value;
        }

        public MiNode() {

        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public MiNode getPrev() {
            return prev;
        }

        public void setPrev(MiNode prev) {
            this.prev = prev;
        }

        public MiNode getNext() {
            return next;
        }

        public void setNext(MiNode next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MiNode miNode = (MiNode) o;
            return Objects.equals(value, miNode.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public String toString() {
            return "MiNode{" +
                    "value=" + value +
                    '}';
        }
    }
}
