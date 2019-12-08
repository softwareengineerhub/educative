/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh05.stack.sort;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
        
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
        
    public static void sortStack(Stack<Integer> stack) {
        int[] data = new int[stack.size()];
        for(int i=0;i<data.length;i++){
            data[i] = stack.pop();
        }
        Arrays.sort(data);
        for(int i=0;i<data.length;i++){
            stack.push(data[i]);
        }
    }
    
}
