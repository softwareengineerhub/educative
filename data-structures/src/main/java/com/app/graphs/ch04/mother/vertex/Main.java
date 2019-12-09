/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch04.mother.vertex;

import com.app.graphs.ch01.adjacency.list.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String args[]) {
        CheckMotherVertex checkMotherVertex = new CheckMotherVertex();
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 0);
        g.addEdge(3, 1);
        g.printGraph();
        System.out.println("Mother Vertex is: " + checkMotherVertex.findMotherVertex(g));
    }

}
