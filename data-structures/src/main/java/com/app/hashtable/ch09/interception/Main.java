/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch09.interception;

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
        interception(a, b);
    }
    
    private static void interception(List a, List b){
        Set set = new HashSet();
        set.addAll(a);
        
        Set result = new HashSet();
        for(Object item : b){
            if(set.contains(item)){
                result.add(item);
            }
        }
        
        System.out.println(result);        
    }
    
}
