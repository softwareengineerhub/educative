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
public class DFSSearch2 {

    public String traverseGraph(Graph g, int source) {
        String res = "";
        int n = g.getVericesCount();

        boolean[] visited = new boolean[n];
        Stack<Integer> storage = new Stack();
        storage.push(source);

        while (!storage.isEmpty()) {
            int val = storage.pop();
            res+=val;
            visited[val] = true;

            if(g.getArray()[val]!=null){
                LinkedList<Integer> list =  g.getArray()[val];
                for(int i: list){
                    storage.push(i);
                }
            }

        }
        return res;
    }

}
