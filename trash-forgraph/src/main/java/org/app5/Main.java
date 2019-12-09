/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app5;

import com.mycompany.trash.forgraph.Graph;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
     public static void main(String args[]) {
        FindMotherVertex cmv = new FindMotherVertex();
        
        Graph g = new Graph(4);
        g.addEdge(3, 0);
        g.addEdge(0, 1);
        g.addEdge(3, 1);        
        g.addEdge(1, 2);
        
        g.printGraph();
        System.out.println("Mother Vertex is: " + cmv.findRoot(g));

    }
    
}
