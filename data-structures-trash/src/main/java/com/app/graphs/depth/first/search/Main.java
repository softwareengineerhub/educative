/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.depth.first.search;

import com.app.graphs.adjacency.list.Graph;

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

        ChcekDFS cdfs = new ChcekDFS();
        System.out.println(cdfs.dfsTraversal(g, 0));
    }

}
