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
public class MinStack {
    private int maxSize;
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack(int maxSize) {
        this.maxSize = maxSize;
        minStack = new Stack<>();
        mainStack = new Stack<>();
    }
    
    public void push(int item){
        mainStack.push(item);        
        if(!minStack.isEmpty() && minStack.peek()<item){
            minStack.push(minStack.peek());
        } else {
            minStack.push(item);
        }
    }
    
    public int pop(){        
        mainStack.pop();
        return minStack.pop();
    }
    
    public int min(){
        return minStack.peek();
    }
    
}
