package org;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class App {

    public static void main(String[] args) {
        Cache cache =  CacheBuilder.newBuilder().build();
        cache.put("a", "A");

        Object val = cache.getIfPresent("и");
        System.out.println("val="+val);

    }

}
