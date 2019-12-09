/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch05.twopairs.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DProkopiuk
 */
public class Main {


    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 12, 9};
        List<int[]> res = findPair(arr);
        for(int[] item: res){
            System.out.println(Arrays.toString(item));
        }
    }
    
    
    public static List<int[]> findPair(int[] arr){
        List<int[]> list = new ArrayList();
        
        Map<Integer, int[]> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                
                if(!map.containsKey(sum)){
                    map.put(sum, new int[]{arr[i], arr[j]});
                } else {
                    int[] pair = map.get(sum);
                    list.add(pair);
                    list.add(new int[]{arr[i], arr[j]});
                    return list;
                }
                
            }            
        }        
        return list;
    }
    
}
