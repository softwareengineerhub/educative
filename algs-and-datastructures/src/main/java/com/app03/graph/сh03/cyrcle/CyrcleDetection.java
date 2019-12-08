/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh03.cyrcle;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.List;

/**
 *
 * @author asusadmin
 */
public class CyrcleDetection {

    public boolean hasCyrcle(MyGraph g) {
        int n = g.getVerticiesCount();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < g.getArray().length; i++) {
            if (hasCyrcle(g, i, visited)) {
                return true;
            }
        }
        return false;

    }

    private boolean hasCyrcle(MyGraph g, int source, boolean[] visited) {
        if (visited[source]) {
            return true;
        }

        visited[source] = true;

        List list = g.getArray()[source];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (hasCyrcle(g, (int) list.get(i), visited)) {
                    return true;
                }
            }
        }
        visited[source] = false;

        return false;
    }

}
