/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch08.remove.dublicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        
        Set set = new HashSet();
        set.addAll(list);
        
        list.clear();
        list.addAll(set);
        
        System.out.println(list);
        
    }
    
    
    
    
}
