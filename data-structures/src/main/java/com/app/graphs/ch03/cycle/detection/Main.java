/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch03.cycle.detection;

import com.app.graphs.ch01.adjacency.list.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String args[]) {

        CheckCycle checkCycle = new CheckCycle();
        
        Graph g1 = new Graph(4);
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(3, 0);
        g1.printGraph();
        System.out.println(checkCycle.detectCycle(g1));

        System.out.println();
        Graph g2 = new Graph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);        
        g2.printGraph();
        System.out.println(checkCycle.detectCycle(g2));
    }

}
