/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.bfs;

import com.mycompany.trash.forgraph.Graph;

/**
 *
 * @author Dprokopiuk
 */
public class Main {
    
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);        
        g.printGraph();

        BFSSearch bfs = new BFSSearch();
        String str = bfs.traverseGraph(g, 0);
        System.out.println(str);
    }
    
}
