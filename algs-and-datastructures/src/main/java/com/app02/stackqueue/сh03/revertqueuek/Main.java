/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh03.revertqueuek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        System.out.println(queue);
        reverseK(queue, 3);
        System.out.println(queue);
                
    }
    
    public static void reverseK(Queue queue, int k) {
        
        Stack stack = new Stack();
        for (int i = 0; i < k; i++) {
            Object headItem = queue.remove();
            stack.push(headItem);
        }
        
        while(!stack.isEmpty()){
            Object tailItem = stack.pop();
            queue.add(tailItem);
        }
        
       // System.out.println("\t"+queue);
        int n = queue.size();
        for(int i=0;i<n-k;i++){
            Object tmp = queue.remove();
            queue.add(tmp);
        }
        
    }
    
}
