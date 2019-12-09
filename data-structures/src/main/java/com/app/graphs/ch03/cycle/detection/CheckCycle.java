/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch03.cycle.detection;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class CheckCycle {

    public boolean detectCycle(Graph g){
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];
        boolean[] stackFlag = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(cyclic(g, i, visited, stackFlag)){
                System.out.println(Arrays.toString(stackFlag));
               return true; 
            }
        }
        return false;
    }
    
    private boolean cyclic(Graph g, int v, boolean[] visited, boolean[] stackFlag){
        if(stackFlag[v]){
            return true;
        }
        
        if(visited[v]){
            return false;
        }
        
        visited[v] = true;
        stackFlag[v] = true;
        
        
        LinkedList data = g.getArray()[v];
        if (data != null) {
            
            int tmpIndex = 0;            
            while (tmpIndex <data.size()) {
                if(cyclic(g, (int) data.get(tmpIndex), visited, stackFlag)){
                    return true;
                }                
                tmpIndex++;                
            }
        }
        
        stackFlag[v] = false;
        return false;        
    }
    
}
