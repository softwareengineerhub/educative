/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh02.dfs;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class CheckDFS {
    
    public String bfsTraversal(MyGraph g, int source) {
        String result = "";
        int n = g.getVerticiesCount();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack();
        stack.add(source);
        while (!stack.isEmpty()) {
            int itemValue = stack.pop();
            visited[itemValue] = true;
            result += itemValue;
            List list = g.getArray()[itemValue];
            if (list != null) {
                for (Object obj : list) {
                    if (!visited[(Integer) obj]) {
                        stack.push((Integer) obj);
                    }
                }
            }
        }
        return result;
    }
    
}
