/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch07.first.nonrepeatable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {2, 54, 7, 2, 6, 54};
        int res = findFirstUnique(arr);
        System.out.println(res);
    }
    
    private static int findFirstUnique(int[] arr){
        Map<Integer, Boolean> map = new LinkedHashMap();
        
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], true);
            } else{
                map.put(arr[i], false);
        
            }            
        }        
        for(int key: map.keySet()){
            if(map.get(key)){
                return key;
            }
        }
        return -1;
    }
}
