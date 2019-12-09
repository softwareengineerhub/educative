/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.path.between.vertices;

import com.app.graphs.adjacency.list.Graph;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class AllPaths {
        
    public void findPath(Graph g, int source, int target) {        
        Stack<Integer> stack = new Stack();
        find(g, source, target, stack);
    }    
    
    private void find(Graph g, int source, int target, Stack<Integer> stack) {
        List<Integer> list = g.getArrays()[source];
        stack.push(source);
        if(source==target){
            System.out.println(stack);
            stack.pop();
            return;
        }
        
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                find(g, list.get(i), target, stack);
            }
        }
        
        stack.pop();
    }
    
}
