package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU {

    private LinkedList items = new LinkedList();
    private Map<String, Object> cache = new HashMap<>();
    public int capacity = 10;

    public void put(String key, Object value){
        if(cache.size()<capacity) {
            cache.put(key, value);
            items.add(value);
        } else {
            Object last = items.removeLast();
            cache.remove(last);
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

}
