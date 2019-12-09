/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch04.mother.vertex;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class MyRootVertex {

    public int find(Graph g){
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];
        DFS(g, n, visited);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return i;
            }
        }
        return -1;
    }
    
    
    private void DFS(Graph g, int source, boolean[] visited) {
                
    }
    
}
