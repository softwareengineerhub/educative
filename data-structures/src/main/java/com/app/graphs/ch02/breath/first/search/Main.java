/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch02.breath.first.search;

import com.app.graphs.ch01.adjacency.list.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String args[]) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);        
        g.printGraph();

        CheckBFS bfs = new CheckBFS();
        String str = bfs.bfsTraversal(g, 0);
        System.out.println(str);

        //
    }

}
