/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch07.istree2;

import com.app.graphs.ch01.adjacency.list.Graph;
import com.app.graphs.ch07.istree.CheckTree;

/**
 *
 * @author Dprokopiuk
 */
public class Main {

    public static void main(String args[]) {
        CheckTree2 checkTree = new CheckTree2();

        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.printGraph();
        System.out.println("isTree : " + checkTree.isTree(g));

        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(0, 3);
        g2.addEdge(3, 2);
        g2.printGraph();
        System.out.println("isTree : " + checkTree.isTree(g2));

        Graph g3 = new Graph(6);
        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(0, 3);
        g3.addEdge(4, 5);
        g3.printGraph();
        System.out.println("isTree : " + checkTree.isTree(g3));
    }

}
