/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch02.depth.first.search;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class ChcekDFS {

    public String dfsTraversal(Graph g, int source) {

        LinkedList[] array = g.getArray();

        String result = "";
        int numOfVertices = g.getVerticesCount();
        boolean[] visited = new boolean[numOfVertices];
        Stack stack = new Stack();
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
                        
            Integer currentNode = (Integer) stack.pop();
            result += currentNode;            
            
            int tmpIndex = 0;
            Integer tmp = null;
            if (array[currentNode] != null) {            
                tmp = (Integer) array[currentNode].get(tmpIndex);
            }
            
            while(tmp!=null && tmp<visited.length){
                if(!visited[tmp]){
                    visited[tmp] = true;
                    stack.push(tmp);
                }
                try{
                    tmp = (Integer) array[currentNode].get(++tmpIndex);
                }catch(Exception ex){
                    tmp = null;
                }
            }
                        
        }
       
        return result;
    }

}
