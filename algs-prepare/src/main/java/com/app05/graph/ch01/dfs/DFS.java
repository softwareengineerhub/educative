package com.app05.graph.ch01.dfs;

import com.app05.graph.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    public void traverseGraph(Graph g, int source) {
        LinkedList<Integer> list = g.getArray()[source];
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder result = new StringBuilder();
        Stack<Integer> storage = new Stack<>();
        storage.push(source);
        while (!storage.isEmpty()) {
            int lastItem = storage.pop();
            result.append(lastItem);
            LinkedList<Integer> children = g.getArray()[lastItem];
            if(children!=null){
                for(int i: children){
                    storage.push(i);
                }
            }
        }
        System.out.println(result);
    }

}
