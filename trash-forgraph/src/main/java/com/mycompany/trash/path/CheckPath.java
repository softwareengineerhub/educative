/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.path;

import com.mycompany.trash.forgraph.Graph;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class CheckPath {

    public boolean hasPath(Graph g, int source, int destination) {

        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];

        Stack<Integer> storage = new Stack();
        storage.push(source);

        while (!storage.isEmpty()) {
            int value = storage.pop();
            visited[value] = true;

            List<Integer> tmp = g.getArray()[value];
            if (tmp == null) {
                continue;
            }

            for (int i = 0; i < tmp.size(); i++) {
                int tmpValue = tmp.get(i);
                if (tmpValue == destination) {
                    return true;
                }

                if (visited[tmpValue]) {
                    continue;
                }
                storage.push(i);
            }

        }
        return false;
    }

}
