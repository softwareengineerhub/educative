/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch09.union;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DProkopiuk
 */
public class Main {
   
    public static void main(String[] args) {
        List a = Arrays.asList(15,22,8);
        List b = Arrays.asList(7,14,22);
        union(a, b);
    }
    
    private static void union(List a, List b){
        Set set = new HashSet();
        set.addAll(a);
        set.addAll(b);
        System.out.println(set);        
    }
    
}
