/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh01.generatenumbersbyquуue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        String[] array = findBin(3);
        System.out.println(Arrays.toString(array));
        
        array = findBin(5);
        System.out.println(Arrays.toString(array));
    }
    
    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        result[0] = "1";
        
        for(int i=0;i<number;i++){
            String oldValue = queue.remove();
            result[i] = oldValue;
            queue.add(oldValue+"1");
            queue.add(oldValue+"0");            
        }        
        return result;        
    }
    
}
