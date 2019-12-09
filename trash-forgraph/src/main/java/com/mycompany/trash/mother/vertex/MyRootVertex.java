/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.mother.vertex;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class MyRootVertex {

    public int findRoot(Graph g) {
        int n = g.getVericesCount();
        List[] data = g.getArray();
        boolean[] visited = new boolean[n];
        int lastVisited = -1;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                dfs(g, i, visited);
                lastVisited = i;
            }
        }

        visited = new boolean[n];
        dfs(g, lastVisited, visited);

        return lastVisited;
    }

    private void dfs(Graph g, int source, boolean[] visited) {       

        Stack<Integer> storage = new Stack();
        storage.push(source);

        while (!storage.isEmpty()) {
            int value = storage.pop();
            visited[value] = true;

            LinkedList<Integer> tmp = g.getArray()[value];
            if (tmp == null) {
                continue;
            }
            for (int i = 0; i < tmp.size(); i++) {
                storage.push(tmp.get(i));
            }
        }     
    }

}
