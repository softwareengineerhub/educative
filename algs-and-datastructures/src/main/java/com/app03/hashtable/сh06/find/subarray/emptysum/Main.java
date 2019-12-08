/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh06.find.subarray.emptysum;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {6, 4, -7, 3, 12, 9};
        boolean res = findSubZero(arr);
        System.out.println(res);
    }
    
    public static boolean findSubZero(int[] arr){
        Map<Integer, Integer> map = new HashMap();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum==0 || arr[i]==0 || map.get(sum)!=null){
                System.out.println(i);
                return true;
            }
            
            map.put(sum, i);
            
        }        
        return false;
    }
    
}
