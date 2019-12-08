/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh07.find.first.unique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int res = findFirstUnique(arr);
        System.out.println(res);
    }
    
    public static int findFirstUnique(int[] arr){
        Set set = new HashSet();
        set.addAll(Arrays.asList(arr));
        for(int i: arr){
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
