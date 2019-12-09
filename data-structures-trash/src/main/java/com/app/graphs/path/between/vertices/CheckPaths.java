/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.path.between.vertices;

import com.app.graphs.adjacency.list.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class CheckPaths {

    public static Object checkPath(Graph g, int source, int destination) {
        int n = g.getVerticesCount();

        boolean[] visited = new boolean[n];

        Stack stack = new Stack();
        stack.push(source);

        while (!stack.isEmpty()) {
            int tmp = (int) stack.pop();
            visited[tmp] = true;
            if (destination == tmp) {
                return true;
            }

            LinkedList data = g.getArrays()[tmp];
            if (data != null) {
                for (int i = 0; i < data.size(); i++) {
                    if (!visited[(int) data.get(i)]) {
                        stack.push(data.get(i));
                    }
                }

            }
        }
        return false;
    }

}
