/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh08.findcelebrity;

import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[][] party = {{0,1,0,1},{0,0,0,0},{1,1,0,0},{0,1,0,0}};
        int res = findCelebrity(party, 4);
        System.out.println(res);
    }
    
    public static int findCelebrity(int[][] party,int numPeople){
        Stack<Integer> stack = new Stack();
        int n = party.length;
        for(int i=0;i<n;i++){
            int[] line = party[i];
            for(int j=0;j<line.length;j++){
                if(i!=j){
                    //i knows j
                    if(party[i][j]==1){
                        stack.push(j);
                    }
                }
            }
            //stack.push(i);
        }
        System.out.println(stack);
        
        while(!stack.isEmpty()){
            int index = stack.pop();
            int[] line = party[index];
            boolean isCelebrity = true;
            for(int value: line){
                if(value!=0){
                    isCelebrity = false;
                    break;
                }
            }
            if(isCelebrity){
                return index;
            }
        }
        
        return -1;
    }
    
}
