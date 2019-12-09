/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch04.mother.vertex;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class CheckMotherVertex {

    public int findMotherVertex(Graph g) {
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];
        int lastV = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                DFS(g, i, visited);
                lastV = i;
            }
        }

        visited = new boolean[n];
        DFS(g, lastV, visited);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return -1;
            }
        }
        return lastV;
    }

    private void DFS(Graph g, int source, boolean[] visited) {
        Stack storage = new Stack();
        storage.push(source);
        while (!storage.isEmpty()) {

            int val = (int) storage.pop();
            visited[val] = true;

            LinkedList data = g.getArray()[val];
            if (data != null) {
                for (int i = 0; i < data.size(); i++) {
                    int tmp = (int) data.get(i);
                    if (!visited[tmp]) {
                        storage.push(tmp);
                    }
                }
            }

        }
    }

}
