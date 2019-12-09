/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch07.istree;

import com.app.graphs.ch01.adjacency.list.Graph;
import com.app.graphs.ch03.cycle.detection.CheckCycle2;
import com.app.graphs.ch07.istree2.CheckTree2;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class CheckTree {

    public boolean isTree(Graph g) {
        //1. Check each node other than root has exactly one parent.
        if (!checkOneParent(g)) {
            return false;
        }
        
        if (detectCycle(g)){
            return false;
        }
        
        if (!checkConnected(g, 0)) {
            return false;
        }
        
        //CheckTree2 ct = new CheckTree2();
        //return ct.isTree(g);
        
        return true;
    }
    
    
    private boolean detectCycle(Graph g){
        CheckCycle2 checkCycle2 = new CheckCycle2();
        return checkCycle2.detectCycle(g);
    }

    private boolean checkConnected(Graph g, int source) {
        int n = g.getVerticesCount();
        int vertices_reached = 0;
        boolean[] visited = new boolean[n];

        Stack<Integer> stack = new Stack();
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            LinkedList<Integer> temp = null;
            if (g.getArray()[currentNode] != null) {
                temp = g.getArray()[currentNode];
            } else {
                continue;
            }
            for (int i = 0; i < temp.size(); i++) {
                int val = temp.get(i);
                if (!visited[val]) {
                    stack.push(val);
                    visited[val] = true;
                    vertices_reached++;
                }
            }
        }
        return (vertices_reached + 1) == n;
    }

    private boolean checkOneParent(Graph g) {
        int n = g.getVerticesCount();
        boolean[] hasOneParent = new boolean[n];
        LinkedList<Integer> tmp = null;

        for (int i = 0; i < n; i++) {
            tmp = g.getArray()[i];
            if (g.getArray()[i] == null) {
                continue;
            }
            int tmpIndex = 0;
            while (tmpIndex < tmp.size()) {
                int val = tmp.get(tmpIndex);
                if (hasOneParent[val]) {
                    return false;
                }
                hasOneParent[val] = true;
                tmpIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (hasOneParent[i]) {
                    return false;
                }
                continue;
            }

            if (!hasOneParent[i]) {
                return false;
            }

        }
        return true;
    }

}
