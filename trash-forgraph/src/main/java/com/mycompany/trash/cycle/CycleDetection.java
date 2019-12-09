/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.cycle;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;

/**
 *
 * @author Dprokopiuk
 */
public class CycleDetection {
    
    public boolean hasCycle(Graph g){
        int n = g.getVericesCount();
        LinkedList[] array = g.getArray();
        
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];
        
        for(int i=0;i<array.length;i++){
            
            LinkedList<Integer> tmp = array[i];
            if(tmp==null){
                continue;
            }           
            
            if(check(g, i, visited, inStack)){
               return true; 
            }
            
        }        
        return false;
    }
    
    private boolean check(Graph g, int source, boolean[] visited, boolean[] inStack){
        if(inStack[source]){
            return true;
        }
        
        if(visited[source]){
            return false;
        }
        
        LinkedList<Integer> tmp = g.getArray()[source];
        for(int i=0;i<tmp.size();i++){
            if(check(g, tmp.get(i), visited, inStack)){
                return true;
            }
        }
        
        inStack[source] = false;
        return false;
    }
    
}
