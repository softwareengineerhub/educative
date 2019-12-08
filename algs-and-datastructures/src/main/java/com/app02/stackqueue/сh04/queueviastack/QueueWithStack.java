/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh04.queueviastack;

import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class QueueWithStack {
    private Stack stack = new Stack();
    private Stack stackTmp = new Stack();

    public void enqueue(Object value){
      	stack.push(value);
    }
    public Object dequeue(){
        if(isEmpty()){
            return null;
        }
        int n = stack.size();
        while(n>0){
            Object item = stack.pop();		
            stackTmp.push(item);            
            n--;
        }       
        Object val = stackTmp.pop();
        n = stackTmp.size();
        while(n>0){
            Object item = stackTmp.pop();		
            stack.push(item);
            n--;
        }
        
        return val;
    }
    
    public boolean isEmpty(){        
        return stack.isEmpty();
    }
}
