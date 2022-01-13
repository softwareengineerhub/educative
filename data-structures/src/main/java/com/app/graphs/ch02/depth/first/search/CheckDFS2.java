package com.app.graphs.ch02.depth.first.search;

import com.app.graphs.ch01.adjacency.list.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class CheckDFS2 {

    public void check(Graph g, int source){
        int verticesCount = g.getVerticesCount();
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        boolean[] visited = new boolean[verticesCount];

        while(!stack.isEmpty()){
            int tmp = stack.pop();
            LinkedList<Integer> children = g.getArray()[tmp];
            if(children!=null){
                for(int i: children){
                    stack.push(i);
                }
            }

            System.out.println(tmp);
            visited[tmp] = true;



        }

    }

}
