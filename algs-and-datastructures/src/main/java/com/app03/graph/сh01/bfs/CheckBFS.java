/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh01.bfs;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author asusadmin
 */
public class CheckBFS {

    public String bfsTraversal(MyGraph g, int source) {
        String result = "";
        int n = g.getVerticiesCount();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList();
        queue.add(source);
        while (!queue.isEmpty()) {
            int itemValue = queue.remove();
            visited[itemValue] = true;
            result += itemValue;
            List list = g.getArray()[itemValue];
            if (list != null) {
                for (Object obj : list) {
                    if (!visited[(Integer) obj]) {
                        queue.add((Integer) obj);
                    }
                }
            }
        }
        return result;
    }

}
