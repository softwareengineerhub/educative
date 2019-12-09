/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch02.breath.first.search;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author DProkopiuk
 */
public class CheckBFS {

    public String bfsTraversal(Graph g, int source) {
        String result = "";
        int verticesCount = g.getVerticesCount();        
        boolean[] visited = new boolean[verticesCount];        
        Queue<Integer> queue = new ArrayBlockingQueue(verticesCount);        
        /*for (int i = 0; i < verticesCount; i++) {
            queue.add(i);
        }*/       
           
        
        queue.add(source);
        visited[source] = true;        
        
        while(!queue.isEmpty()){

            int cuurentNode = queue.poll();
            result+=cuurentNode;
            
            Integer tmp = null;
            int tmpIndex = 0;
            if(g.getArray()[cuurentNode]!=null){
                tmp = (Integer) g.getArray()[cuurentNode].get(tmpIndex);
            }
            
            while(tmp!=null ){
                if(tmp<visited.length && !visited[tmp]){
                    queue.add(tmp);
                    visited[tmp] = true;                    
                }
                try{
                    tmp = (Integer) g.getArray()[cuurentNode].get(++tmpIndex);
                }catch(Exception ex){
                    tmp=null;
                }
            }                
        }        
        return result; //For the above graph, it should return "01234" or "02143"
    }

}
