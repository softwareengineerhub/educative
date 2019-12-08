/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh04.mothervertics;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class FindRootVertex {

    public int findRoot(MyGraph g) {
        boolean[] visited = new boolean[g.getVerticiesCount()];
        int lastVisited = -1;

        for (int i = 0; i < g.getVerticiesCount(); i++) {
            if (!visited[i]) {
                DFS(g, i, visited);
                lastVisited = i;
            }
        }

        visited = new boolean[g.getVerticiesCount()];
        DFS(g, lastVisited, visited);

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return -1;
            }
        }

        return lastVisited;
    }

    private void DFS(MyGraph g, int source, boolean[] visited) {
        Stack<Integer> stack = new Stack();
        stack.push(source);

        while (!stack.isEmpty()) {
            int val = stack.pop();
            visited[val] = true;
            List<Integer> list = g.getArray()[val];
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    stack.push(list.get(i));
                }
            }
        }
    }

}
