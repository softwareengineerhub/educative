package com.app02;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class MyCache {
    //last
    //LRU
    private int capacity;
    //o(logn)
    private Map<String, Object> cache;

    //removeFirst - O(1)
    //add - o(1)
    //remove - o(n)

    //logn+n--> O(n)
    private LinkedList list;

    public MyCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap();
        list = new LinkedList();
    }

    public MyCache() {
        this(10);
    }

    public void add(String key, Object data){
        if(cache.size()==capacity){
            list.removeFirst();
        }

        Object oldValue = cache.put(key, data);
        if(oldValue==null){
            list.add(key);
        }else{
            list.remove(key);
            list.add(key);
        }

    }

    public Object get(String key) {
        if(cache.containsKey(key)){
            list.remove(key);
        }
        list.add(key);
        return cache.get(key);
    }

}
