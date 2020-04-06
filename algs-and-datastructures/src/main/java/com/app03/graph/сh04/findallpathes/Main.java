/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh04.findallpathes;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        FindAllPathes fs = new FindAllPathes();
        MyGraph g1 = new MyGraph(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 4);

        g1.addEdge(1, 2);
        g1.addEdge(1, 3);

        g1.addEdge(4, 6);
        g1.addEdge(4, 5);

        g1.addEdge(0, 7);


        List<Stack<Integer>> result = fs.findAllPathes(g1);
        for(Stack<Integer> path: result){
            System.out.println(path);
        }
        
        //System.out.println("");
    }
    
}
