/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app3;

import com.mycompany.trash.forgraph.Graph;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    
    public static void main(String[] args) {     
        AllPathes fs = new AllPathes();
        Graph g1 = new Graph(9);
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
    }
    
}
