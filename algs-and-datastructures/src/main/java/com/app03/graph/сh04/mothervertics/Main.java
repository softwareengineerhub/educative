/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh04.mothervertics;

import com.app03.graph.сh00.graph.MyGraph;

/**
 *
 * @author asusadmin
 */
public class Main {
 
    public static void main(String[] args) {
        FindRootVertex findRootItem = new FindRootVertex();
        MyGraph g = new MyGraph(4);
        g.addEdge(3, 0);
        g.addEdge(0, 1);
        g.addEdge(3, 1);
        g.addEdge(1, 2);

        g.printGraph();
        System.out.println("Mother Vertex is: " + findRootItem.findRoot(g));
    }
    
}
