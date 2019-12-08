/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh01.array.is.subset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr1 = new int[]{9,4,7,1,-2,6,5};
        int[] arr2 = new int[]{7,1,-2};
        boolean res = isSubset(arr1, arr2);
        System.out.println(res);
    }
    
    
    public static boolean isSubset(int []arr1, int[] arr2){
        Set set = new HashSet();
        if(arr1.length>arr2.length){            
            set.addAll(Arrays.asList(arr1));
        } else {
            set.addAll(Arrays.asList(arr2));
        }
        
        if(set.containsAll(Arrays.asList(arr1))){
            return true;
        }
        if(set.containsAll(Arrays.asList(arr2))){
            return true;
        }
        return false;
    }
    
}
