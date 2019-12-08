/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh09.union.and.interception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        List list1 = Arrays.asList("A", "B", "C");
        List list2 = Arrays.asList("C", "D", "E");
        System.out.println(union(list1, list2));
        System.out.println(intersection(list1, list2));
    }
    
    public static List union(List list1, List list2){
        Set set = new HashSet();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList(set);
    }
    
    public static List intersection(List list1, List list2){
        Set set = new HashSet();
        set.addAll(list1);
        set.addAll(list2);
        
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Object key = itr.next();
            if(list1.contains(key) && list2.contains(key)){
                continue;
            }
            itr.remove();            
        }
        return new ArrayList(set);
    }
    
}
