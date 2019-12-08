/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh02.dfs;

import com.app03.graph.сh00.graph.MyGraph;

/**
 *
 * @author asusadmin
 */
public class Main {
 
    public static void main(String[] args) {
        MyGraph g = new MyGraph(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(4, 5);
        g.addEdge(3, 6);
        
        CheckDFS checkDFS = new CheckDFS();
        System.out.println(checkDFS.bfsTraversal(g, 0));
    }
    
}
