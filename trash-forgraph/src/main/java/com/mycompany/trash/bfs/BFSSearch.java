/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.bfs;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;

/**
 *
 * @author Dprokopiuk
 */
public class BFSSearch {
    
    public String traverseGraph(Graph g, int source){
        String result = "";
        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];
        
        LinkedList<Integer> storage = new LinkedList();
        storage.add(source);
        
        while(!storage.isEmpty()){
            int value = storage.removeFirst();
            visited[value] = true;
            result+=value;
            
            LinkedList<Integer> tmp = g.getArray()[value];
            if(tmp==null){
                continue;
            }
            for(int i=0;i<tmp.size();i++){
                storage.add(tmp.get(i));
            }
        }
        
        return result;
    } 
    
}
