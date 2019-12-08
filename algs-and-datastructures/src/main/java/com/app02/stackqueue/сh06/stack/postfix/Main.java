/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh06.stack.postfix;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        String expression = "921*-8-4+";
        int res = evaluatePostFix(expression);
        System.out.println(res);
    }
    
    
    public static int evaluatePostFix(String expression) {        
        Stack<Character> stack = new Stack();
         
        char[] arr = expression.toCharArray();
        //String tmp = "";
        for(int i=0;i<arr.length;i++){            
            char c = arr[i];
            
            if(!Character.isDigit(c)){
                
                int val = 0;
                
                if(stack.isEmpty()){
                    
                }
                
                int oldVal = 0;
                if(!stack.isEmpty()){
                    oldVal = stack.pop();
                } else {
                    stack.push(c);
                    continue;
                }
                int resTmp = 0;
                if('*'==c){
                    resTmp = oldVal*val;
                }else if('/'==c){
                    resTmp = oldVal/val;
                }else if('+'==c){
                    resTmp = oldVal+val;
                }else if('-'==c){
                    resTmp = oldVal-val;
                }
                
            } else {                
                stack.push(c);                
            }
        }        
        return Integer.MIN_VALUE;
    }
    
}
