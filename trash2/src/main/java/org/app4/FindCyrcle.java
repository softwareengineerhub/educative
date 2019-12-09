/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app4;

import com.mycompany.trash.forgraph.Graph;
import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class FindCyrcle {

    public boolean hasCercle(Graph g) {
        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check(g, i, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean check(Graph g, int source, boolean[] visited) {
        if (visited[source]) {
            return true;
        }

        visited[source] = true;
        LinkedList<Integer> list = g.getArray()[source];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (check(g, list.get(i), visited)) {
                    return true;
                }
            }
        }

        visited[source] = false;

        return false;
    }

    /*private boolean check(Graph g, int source, boolean[] inStack) {
        if (inStack[source]) {
            return true;
        }
        
        inStack[source] = true;        

        LinkedList<Integer> list = g.getArray()[source];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                int tmpSource = list.get(i);
                if (check(g, tmpSource, inStack)) {
                    return true;
                }
            }
        }

        inStack[source] = false;        

        return false;
    }*/
}
