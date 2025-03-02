package com.app05.graph;

import java.util.LinkedList;

public class Graph {
    private LinkedList[] array;
    private int vericesCount;

    public Graph(int vericesCount) {
        this.vericesCount = vericesCount;
        array = new LinkedList[vericesCount];
    }

    public void addEdge(int source, int value) {
        if (array[source] == null) {
            array[source] = new LinkedList();
        }
        array[source].add(value);
    }

    public void printGraph() {
        System.out.println("-------Graph start--------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "-->" + array[i]);
        }
        System.out.println("-------Graph end----------");
    }

    public LinkedList[] getArray() {
        return array;
    }
}
