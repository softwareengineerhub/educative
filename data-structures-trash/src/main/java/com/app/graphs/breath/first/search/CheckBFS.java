/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.breath.first.search;

import com.app.graphs.adjacency.list.Graph;
import java.util.LinkedList;

public class CheckBFS {

    public String bfsTraversal(Graph g, int source) {
        String result = "";
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];        
        LinkedList storage = new LinkedList();
        storage.add(source);
        
        while(!storage.isEmpty()){
                        
            Integer tmp = (Integer) storage.poll();
            visited[tmp] = true;
            result+=tmp;
                        
            LinkedList item = g.getArrays()[tmp];           
            System.out.println("item:"+item);
            
            int tmpIndex = 0;                        
            while(item!=null && tmpIndex<item.size()){                
                if(!visited[(int)item.get(tmpIndex)]){                    
                    storage.add(item.get(tmpIndex));
            //        System.out.println("\there:"+storage);
                }
                tmpIndex++;                                                                
            }  
            System.out.println("\tafter while "+storage);
        }
                
        return result; //For the above graph, it should return "01234" or "02143"
    }

}
