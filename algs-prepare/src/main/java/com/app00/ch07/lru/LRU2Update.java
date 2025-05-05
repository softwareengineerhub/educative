package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class LRU2Update {
    private Map<String, Node> cache = new HashMap<>();
    private Node head = new Node("head", "head");
    private Node tail = new Node("tail", "tail");
    private final int capacity;

    public LRU2Update(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public void put(String key, Object value){
        Node node = new Node(key, value);
        if(cache.containsKey(node)){
            cache.put(key, node);
            updateKeyPosition(node);
        } else {
            if(cache.size()==capacity){
                Node evictionKey = findEvictionKey();
                cache.remove(evictionKey.key);
                cache.put(key, node);
                firstTimeKeyPosition(node);
            } else {
                cache.put(key, node);
                firstTimeKeyPosition(node);
            }
        }
    }

    public Object get(String key){
        Node node = cache.get(key);
        if(node!=null) {
            updateKeyPosition(node);
        }
        return cache.get(key);
    }

    private void updateKeyPosition(Node key) {

       // keysPosition.remove(key);
       // keysPosition.addFirst(key);
        Node prevTmp = key.prev;
        Node nextTmp = key.next;
        if(prevTmp!=null) {
            prevTmp.next = nextTmp;
        }
        if(nextTmp!=null) {
            nextTmp.prev = prevTmp;
        }

        firstTimeKeyPosition(key);
    }

    private void firstTimeKeyPosition(Node key) {
        Node tmp = head.next;
        head.next = key;
        key.prev = head;

        tmp.prev = key;
        key.next = tmp;
    }

    private Node findEvictionKey(){
        return tail.prev;
        //return keysPosition.getLast();
    }

    private class Node {
        private String key;
        private Object value;
        private Node next;
        private Node prev;

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Node() {

        }

        public Object getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public String getKey() {
            return key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(key, node.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }


    public static void main(String[] args) {
        LRU2Update cache = new LRU2Update(2); // capacity of 2
        cache.put("1", 1);
        cache.put("2", 2);
        Object value =  cache.get("1");       // returns 1
        System.out.println("value=" + value);
        cache.put("3", 3);    // evicts key 2
        Object value2 = cache.get("2");
        System.out.println("value2=" + value2);

        Object value3 = cache.get("3");
        System.out.println("value3=" + value3);
    }
}
