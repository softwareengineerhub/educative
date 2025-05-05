package com.app00.ch07.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU2 {
    private Map<String, Object> cache = new HashMap<>();
    private LinkedList<String> keysPosition = new LinkedList<>();
    private final int capacity;

    public LRU2(int capacity){
        this.capacity = capacity;
    }

    public void put(String key, Object value){
        if(cache.containsKey(key)){
            cache.put(key, value);
            updateKeyPosition(key);
        } else {
            if(cache.size()==capacity){
                String evictionKey = findEvictionKey();
                cache.remove(evictionKey);
                cache.put(key, value);
                firstTimeKeyPosition(key);
            } else {
                cache.put(key, value);
                firstTimeKeyPosition(key);
            }
        }
    }

    private void updateKeyPosition(String key){
        keysPosition.remove(key);
        keysPosition.addFirst(key);
    }

    private void firstTimeKeyPosition(String key){
        keysPosition.addFirst(key);
    }

    private String findEvictionKey(){
        return keysPosition.getLast();
    }
}
