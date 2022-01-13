package com.app02.hashmaps.ch04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindJourney {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("NewYork", "Chicago");
        map.put("Boston", "Texas");
        map.put("Missouri", "NewYork");
        map.put("Texas", "Missouri");
        String res = tracePath(map);
        System.out.println("res="+res);
    }

    public static String tracePath(Map<String, String> map) {
        String result = "";

        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        String firstKey = findFirstKey(keys, values);

        while (firstKey != null) {
            String val = map.get(firstKey);
            if(val==null){
                break;
            }
            result += firstKey + "=" + val + "\n";
            firstKey = val;
        }


        return result;
    }

    private static String findFirstKey(Set<String> keys, Collection<String> values) {
        for (String key : keys) {
            if (!values.contains(key)) {
                return key;
            }
        }
        return null;
    }

}
