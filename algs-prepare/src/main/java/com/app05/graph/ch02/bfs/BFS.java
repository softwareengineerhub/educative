package com.app05.graph.ch02.bfs;

import com.app05.graph.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void traverseGraph(Graph g, int source) {
        LinkedList<Integer> list = g.getArray()[source];
        if(list==null || list.isEmpty()){
            return;
        }
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            int tmp = queue.remove();
            result.append(tmp);
            LinkedList<Integer> children = g.getArray()[tmp];
            if(children!=null){
                for(int i: children){
                    queue.add(i);
                }
            }
        }
        System.out.println(result);
    }

}
