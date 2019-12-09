/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch06.subarray.with0sum;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 4, -7, 3, 12, 9};
        boolean res = findSubZero(arr);
        System.out.println(res);
    }

    private static boolean findSubZero(int[] arr) {                   
        
        Map<Integer, Integer> map = new HashMap();
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            System.out.println("------------------------------");
            if(arr[i]==0){
                return true;
            }
                        
            sum+=arr[i];
            if(sum==0){
                return true;
            }
            
            System.out.println(map);
            System.out.println("sum="+sum);
            
            //if the sum revers back to a value which was already a key in the hash table
            if(map.get(sum)!=null){
                //map.put(sum, i);
                System.out.println("!!!!!!res="+map+"; "+arr[i]);
                return true;
            }
            map.put(sum, i);
        }
        
        System.out.println("---------------------------");
        System.out.println(map);
        return false;
    }

}
