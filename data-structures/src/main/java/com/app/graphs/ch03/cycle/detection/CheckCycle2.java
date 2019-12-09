/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch03.cycle.detection;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class CheckCycle2 {

    public boolean detectCycle(Graph g) {
        int n = g.getVerticesCount();
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check(g, i, visited, inStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(Graph g, int source, boolean[] visited, boolean[] inStack) {
        if (inStack[source]) {
            return true;
        }

        if (visited[source]) {
            return false;
        }

        inStack[source] = true;
        visited[source] = true;

        LinkedList data = g.getArray()[source];
        if (data != null) {

            for (int i = 0; i < data.size(); i++) {
                if (check(g, (int) data.get(i), visited, inStack)) {
                    return true;
                }
            }

        }

        inStack[source] = false;
        return false;
    }

}
