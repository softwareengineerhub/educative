/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.dfs;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Dprokopiuk
 */
public class DFSSearch {

    public String traverseGraph(Graph g, int source) {
        String res = "";
        int n = g.getVericesCount();

        boolean[] visited = new boolean[n];
        Stack<Integer> storage = new Stack();
        storage.push(source);

        while (!storage.isEmpty()) {
            int value = storage.pop();
            res += value;
            visited[value] = true;

            LinkedList<Integer> tmp = g.getArray()[value];
            if (tmp == null) {
                continue;
            }
            for (int i = 0; i < tmp.size(); i++) {
                storage.push(tmp.get(i));
            }
        }
        return res;
    }

}
