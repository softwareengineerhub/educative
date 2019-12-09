/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch01.adjacency.list;

import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class Graph {

    private int verticesCount;
    private LinkedList[] array;

    public Graph(int verticesCount) {
        this.verticesCount = verticesCount;
        array = new LinkedList[verticesCount];
    }

    public void addEdge(int source, int destination) {
        if (array[source] == null) {
            array[source] = new LinkedList();
        }
        array[source].addFirst(destination);
    }

    public void printGraph() {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < verticesCount; i++) {
            if (array[i] == null) {
                continue;
            }
            System.out.println("[" + i + "] -->" + array[i]);
        }
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public LinkedList[] getArray() {
        return array;
    }

}
