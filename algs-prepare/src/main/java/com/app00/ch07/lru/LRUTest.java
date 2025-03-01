package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUTest {
    private LinkedList<String> orderList = new LinkedList<>();
    private Map<String, Object> cache = new HashMap<>();
    private int capacity;


    public LRUTest(int capacity) {
        this.capacity = capacity;
    }

    public Object put(String key, Object value) {
        if (orderList.contains(key)) {
            orderList.remove(key);
        }
        if (cache.size() == capacity) {
            if (!cache.containsKey(key)) {
                evict();
            }
        }
        orderList.add(key);
        return cache.put(key, value);
    }

    public Object get(String key) {
        if(orderList.contains(key)){
            orderList.remove(key);
            orderList.add(key);
        }
        return cache.get(key);
    }

    private void evict() {
        String key = orderList.removeFirst();
        cache.remove(key);
    }

    public static void main(String[] args) {
        LRUTest cache = new LRUTest(2); // capacity of 2
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
