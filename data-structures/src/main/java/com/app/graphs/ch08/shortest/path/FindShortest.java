/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch08.shortest.path;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class FindShortest {

    public static int findMin(Graph g, int source, int destination) {
        int n = g.getVerticesCount();

        boolean[] visited = new boolean[n];

        //For keeping track of distance of current_node from source
        int[] distance = new int[n];

        //Create Queue for Breadth First Traversal and enqueue source in it
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(source);
        
        visited[source] = true;

        //Traverse while queue is not empty
        while (!queue.isEmpty()) {
            //Dequeue a vertex/node from queue and add it to result
            int current_node = queue.removeFirst();            
            //Get adjacent vertices to the current_node from the array,
            //and if they are not already visited then enqueue them in the Queue
            //and also update their distance from source by adding 1 in current_nodes's distance
            LinkedList<Integer> temp = null;
            if (g.getArray()[current_node] != null){
                temp = g.getArray()[current_node];
            }else{
                continue;
            }
            
            int tmpIndex = 0;
            while (tmpIndex<temp.size()) {
                int val = temp.get(tmpIndex);
                if (!visited[val]) {
                    queue.add(val);
                    visited[val] = true;
                    distance[val] = distance[current_node] + 1;
                }
                if (val == destination) {
                    return distance[destination];
                }
                tmpIndex++;
            }
        }
        return -1;
    }
    
}
