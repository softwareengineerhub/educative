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
public class CheckCycle3 {
    
    public boolean detectCycle(Graph g) {
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(checkCycle(g, i, visited, inStack)){
                
            }
        }
        return false;
    }
    
    private boolean checkCycle(Graph g, int source, boolean[] visited, boolean[] inStack){
        if(inStack[source]){
            return true;
        }
        
        if(visited[source]){
            return false;
        }
        
        LinkedList<Integer> data = g.getArrays()[source];
        if (data != null) {
            for (int i = 0; i < data.size(); i++) {
                if (checkCycle(g, data.get(i), visited, inStack)) {
                    return true;
                }
            }
        }
        inStack[source] = false;
        return false;
    }    
    
}
