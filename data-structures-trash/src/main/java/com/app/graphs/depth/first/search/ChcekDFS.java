/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.depth.first.search;

import com.app.graphs.adjacency.list.Graph;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class ChcekDFS {

    public String dfsTraversal(Graph g, int source) {
        String result = "";

        Stack storage = new Stack();
        storage.push(source);
        boolean[] visited = new boolean[g.getVerticesCount()];

        while (!storage.isEmpty()) {
            
            int val = (int) storage.pop();
            visited[val] = true;
            result += val;

            LinkedList data = g.getArrays()[val];
            if (data == null) {
                continue;
            }
            int tmpIndex = 0;
            while (tmpIndex < data.size()) {
                if (!visited[(int) data.get(tmpIndex)]) {
                    storage.push(data.get(tmpIndex));
                }
                tmpIndex++;
            }
        }
        return result; //For the above graph, it should return "01234" or "02143"
    }

}
