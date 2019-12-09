/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch01.arrayissubset;

import java.util.HashSet;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String[] args) {
        int[] array1 = {9,4,7,1,-2,6,5};
        int[] array2 = {7,1,-2};
        
        System.out.println(isSubset(array1, array2));
    }    
    
    private static boolean isSubset(int[] arr1, int[] arr2){
        HashSet<Integer> hashSet = new HashSet();        
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++){
            if(!hashSet.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    
}
