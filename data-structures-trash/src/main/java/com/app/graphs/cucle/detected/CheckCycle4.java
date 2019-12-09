/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.cucle.detected;

import com.app.graphs.adjacency.list.Graph;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class CheckCycle4 {
    
    public boolean detectCycle(Graph g) {
        int n = g.getVerticesCount();
        boolean[] inStack = new boolean[n];
        boolean[] visited = new boolean[n];                
        for(int i=0;i<n;i++){
            if(check(g, i, inStack, visited)){
                return true;
            }
        }        
        return false;
    }
    
    private boolean check(Graph g, int source, boolean[] inStack, boolean[] visited){        
        if(inStack[source]){
            return true;
        }                
        if(visited[source]){
            return false;
        }
        
        inStack[source] = true;
        visited[source] = true;
        LinkedList<Integer> list = g.getArrays()[source];
        if (g.getArrays()[source] != null) {            
            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                if (check(g, val, inStack, visited)) {
                      return true;  
                }
            }
        }
        
        inStack[source] = false;
        return false;
    }
    
}
