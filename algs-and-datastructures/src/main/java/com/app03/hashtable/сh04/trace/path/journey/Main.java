/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh04.trace.path.journey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("NewYork", "Chicago");
        map.put("Boston", "Texas");
        map.put("Missouri", "NewYork");
        map.put("Texas", "Missouri");        
        List<String> pathList = tracePath(map);
        System.out.println(pathList);
    }
        
    private static List<String> tracePath(Map<String, String> map){
        List<String> pathList = new ArrayList();
        
        for(Map.Entry<String, String> entry: map.entrySet()){                        
            String key = entry.getKey();
            String value = entry.getValue();            
            pathList.add(key+"="+value);
            key = value;
            while(map.containsKey(key)){                
                value = map.get(key);                
                pathList.add(key+"="+value);
                key = value;
            }
            
            while(pathList.size()!=map.size()){
                String item = pathList.get(0);            
                String[] array = item.split("=");
                key = array[0];                
                value = key;
                
                if(map.containsValue(value)){                                    
                    key = findKeyByValue(map, value);                                                            
                    pathList.add(0, key+"="+value);
                    key = value;
                }
            }
            break;            
        }        
        return pathList;
    }
    
    private static String findKeyByValue(Map<String, String> map, String value){
        for(String key: map.keySet()){
            if(value.equals(map.get(key))){
                return key;
            }
        }
        return null;
    }
    
}
