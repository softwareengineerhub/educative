/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh07.nextgreaterelement.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {4,6,3,2,8,1};   
        arr = nextGreaterElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack();        
        int[] res = new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--){
            
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(stack.peek()>=arr[i]){
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(stack.isEmpty()){
               res[i] = -1; 
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        
        return res;
    }
    
}
