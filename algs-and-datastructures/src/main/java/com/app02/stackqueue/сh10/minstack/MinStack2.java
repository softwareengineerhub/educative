/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh10.minstack;

import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class MinStack2 {
    private Stack<Integer> mainStack = new Stack();
    private int min;

    public void push(int item){
        mainStack.push(item);
        if(mainStack.isEmpty()){
            min = item;
        } else {
            min = Math.min(min, item);
        }
    }
    
    public int pop(){
        int value = mainStack.pop();
        if(value==min){
            min = findUpdatedMin();
        }
        return value; 
    }
    
    public int min(){
        return min;
    }
    
    private int findUpdatedMin(){
        int[] arr = new int[mainStack.size()];
        Integer tmp = null;
        for(int i=0;i<arr.length;i++){            
             int val= mainStack.pop();
            if(tmp==null){
                tmp = val;
            }else if(val<tmp){
                tmp = val;
            }
            arr[arr.length-1-i] = val;
        }
        return tmp;
    }
}
