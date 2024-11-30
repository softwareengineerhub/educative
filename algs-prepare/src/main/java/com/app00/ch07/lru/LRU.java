package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU {

    private LinkedList items = new LinkedList();
    private Map<String, Object> cache;
    private int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
    }

    public void put(String key, Object value){
        if(cache.size()<capacity) {
            cache.put(key, value);
            items.remove(value);
            items.addFirst(value);
        } else {
            Object last = items.removeLast();
            cache.remove(last);
            items.addFirst(key);
            cache.put(key, value);
        }
    }

    public Object get(String key){
        Object val = cache.get(key);
        if(val==null){
            return val;
        }
        items.remove(val);
        items.addFirst(val);
        return val;
    }

    public static void main(String[] args) {
        LRU cache = new LRU(2); // capacity of 2
        cache.put("1", 1);
        cache.put("2", 2);
        Object value =  cache.get("1");       // returns 1
        System.out.println("value=" + value);
        cache.put("3", 3);    // evicts key 2
        Object value2 = cache.get("2");
        System.out.println("value2=" + value2);
    }

}
