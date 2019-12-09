/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch08.shortest.path;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class AllPaths {        
        
    public void findPath(Graph g, int source, int target){        
        int n = g.getVerticesCount();
        Stack<Integer> stackPath = new Stack<>();
        process(g, source, stackPath, target, "");        
    }
    
    
    private void process(Graph g, int source, Stack<Integer> stackPath, int target, String s){        
        List<Integer> tmp = g.getArray()[source];
        System.out.println(s + "" + source+"; "+tmp);        
        
        stackPath.push(source);
        if(target == source){
            System.out.println("################");
            System.out.println(stackPath);
            stackPath.pop();            
            System.out.println("################");
            return;
        }
        
        if (tmp != null) {
            for (int i = 0; i < tmp.size(); i++) {
                int value = tmp.get(i);
                process(g, value, stackPath, target, "\t" + s);
            }
        }
        stackPath.pop();
    }
    
    
}
