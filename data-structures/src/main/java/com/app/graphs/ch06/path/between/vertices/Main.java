/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch06.path.between.vertices;

import com.app.graphs.ch01.adjacency.list.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String args[]) {
        CheckPaths checkPaths = new CheckPaths();

        Graph g1 = new Graph(9);
        g1.addEdge(0, 2);
        g1.addEdge(0, 5);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(5, 3);
        g1.addEdge(5, 6);
        g1.addEdge(3, 6);
        g1.addEdge(6, 7);
        g1.addEdge(6, 8);
        g1.addEdge(6, 4);
        g1.addEdge(7, 8);
        g1.printGraph();
        System.out.println("Path exists: " + checkPaths.checkPath(g1, 0, 7));
        System.out.println();
        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(1, 3);
        g2.addEdge(2, 3);

        g2.printGraph();
        System.out.println("Path exists: " + checkPaths.checkPath(g2, 3, 0));
    }

}
