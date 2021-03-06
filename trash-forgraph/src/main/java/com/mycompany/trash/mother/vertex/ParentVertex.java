/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.mother.vertex;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class ParentVertex {

    public int find(Graph g) {
        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];
        int lastVisited = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(g, n, visited);
                lastVisited = i;
            }
        }

        visited = new boolean[n];
        dfs(g, lastVisited, visited);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return -1;
            }
        }

        return lastVisited;
    }

    private void dfs(Graph g, int source, boolean[] visited) {
        Stack<Integer> stack = new Stack();
        stack.push(source);

        while (!stack.isEmpty()) {

            int value = stack.pop();
            visited[value] = true;

            LinkedList<Integer> list = g.getArray()[value];
            if (list == null) {
                continue;
            }

            for (int i = 0; i < list.size(); i++) {
                int tmp = list.get(i);
                stack.push(tmp);
            }

        }
    }

}
