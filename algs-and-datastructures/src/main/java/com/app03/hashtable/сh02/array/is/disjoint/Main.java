/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh02.array.is.disjoint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr1 = {9,4,3,1,-2,6,5};
        int[] arr2 = {7,10,8};
        boolean res = isDisjoint(arr1, arr2);
        System.out.println(res);
    }
    
    public static boolean isDisjoint(int[] arr1, int[] arr2){
        Set set = new HashSet();
        set.addAll(Arrays.asList(arr1));
        
        Set set2 = new HashSet();
        set2.addAll(Arrays.asList(arr2));
        int sizeBefore = set.size();
        set.removeAll(set2);
        int sizeAfter = set2.size();
        return sizeBefore==sizeAfter;
    }
    
}
