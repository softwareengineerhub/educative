/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch04.mother.vertex;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class CheckMotherVertex3 {
    
    
    public int findMotherVertex(Graph g) {
        // visited[] is used for DFS. Initially all are 
        // initialized as not visited
        
        int n = g.getVerticesCount();
        
        boolean[] visited = new boolean[n];
        
        // To store last finished vertex (or mother vertex)
        int lastV = 0;

        // Do a DFS traversal and find the last finished vertex
        for (int i = 0; i < g.getVerticesCount(); i++) {
            if (!visited[i]) {
                DFS(g, i, visited);
                lastV = i;
            }
        }

        // If there exist mother vertex (or vetices) in given 
        // graph, then lastV must be one (or one of them) 
        // Now check if lastV is actually a mother vertex (or graph 
        // has a mother vertex). We basically check if every vertex 
        // is reachable from lastV or not. 
        // Reset all values in visited[] as false and do 
        // DFS beginning from lastV to check if all vertices are 
        // reachable from it or not. 
       // Arrays.fill(visited, false);
        System.out.println("lastVisited="+lastV);
        visited = new boolean[n];
        DFS(g, lastV, visited);

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return -1;
            }
        }

        return lastV;
    }
  
    private void DFS(Graph g, int node, boolean[] visited) {
        Stack storage = new Stack();
        storage.push(node);                
        while(!storage.isEmpty()){
            int val = (int) storage.pop();    
            visited[val] = true;
            LinkedList data = g.getArray()[val];
            if(data!=null){
                for(int i=0;i<data.size();i++){
                    int tmp = (int) data.get(i);
                    if(!visited[tmp]){
                        storage.push(tmp);
                    }
                }
            }
        }                
    }

    public static void main(String args[]) {
        CheckMotherVertex3 cmv = new CheckMotherVertex3();
        
        Graph g = new Graph(4);
        g.addEdge(3, 0);
        g.addEdge(0, 1);
        g.addEdge(3, 1);        
        g.addEdge(1, 2);
        
        g.printGraph();
        System.out.println("Mother Vertex is: " + cmv.findMotherVertex(g));

    }
    
}
