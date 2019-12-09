/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch08.shortest.path;

import com.app.graphs.ch01.adjacency.list.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String args[]) {
        FindShortest fs = new FindShortest();
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3); 
        g.addEdge(3,4); 
        g.addEdge(1,4);
        System.out.println(fs.findMin(g, 0, 4));
    }
    
}
