package com.app05.graph.ch02.bfs;

import com.app05.graph.Graph;
import com.app05.graph.ch01.dfs.DFS;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.printGraph();

        BFS dfs = new BFS();
        dfs.traverseGraph(g, 0);
    }

}
