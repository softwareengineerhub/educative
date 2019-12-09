/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app5;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class FindMotherVertex {
    
    public int findRoot(Graph g) {
        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];
        int lastVisted = -1;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                DFS(g, i, visited);
                lastVisted = i;
            }
        }
        
        visited = new boolean[n];
        DFS(g, lastVisted, visited);
        
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return -1;
            }
        }
        
        return lastVisted;
    }
    
    private void DFS(Graph g, int source, boolean[] visited) {
       // int n = g.getVericesCount();
        Stack<Integer> storage = new Stack();        
        storage.push(source);
        
        while (!storage.isEmpty()) {            
            int index = storage.pop();            
            visited[index] = true;
            LinkedList<Integer> list = g.getArray()[index];
            if (list != null) {
                for (int j = 0; j < list.size(); j++) {
                    storage.push(list.get(j));
                }
            }            
        }        
    }
    
}
