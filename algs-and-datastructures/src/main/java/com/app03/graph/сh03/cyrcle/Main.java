/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh03.cyrcle;

import com.app03.graph.сh00.graph.MyGraph;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        CyrcleDetection cyrcleDetection = new CyrcleDetection();

        MyGraph g1 = new MyGraph(4);
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(3, 0);
        g1.printGraph();
        System.out.println(cyrcleDetection.hasCyrcle(g1));

        System.out.println();
        MyGraph g2 = new MyGraph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.printGraph();
        System.out.println(cyrcleDetection.hasCyrcle(g2));
    }
    
}
