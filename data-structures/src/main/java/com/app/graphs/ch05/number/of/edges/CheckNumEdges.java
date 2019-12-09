/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch05.number.of.edges;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author DProkopiuk
 */
public class CheckNumEdges {
    
    public int numEdges(Graph g) {
        Set<String> pairs = new HashSet();
        int n = g.getVerticesCount();
        for (int i = 0; i < n; i++) {
            LinkedList data = g.getArray()[i];
            if (data != null) {
                for (int j = 0; j < data.size(); j++) {
                    String pairA = i + ";" + data.get(j);
                    String pairB = data.get(j) + ";" + i;
                    if (!pairs.contains(pairA) || !pairs.contains(pairB)) {
                        pairs.add(pairA);
                        pairs.add(pairB);
                    }
                }
            }
        }
        return pairs.size() / 2;
    }

}
