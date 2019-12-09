/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.adjacency.list;

import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class Graph {
    private int verticesCount;    
    private LinkedList[] arrays;

    public Graph(int verticesCount) {
        this.verticesCount = verticesCount;
        arrays = new LinkedList[verticesCount];
    }

    public void addEdge(int parentNodeId, int destination) {
        LinkedList array = arrays[parentNodeId];
        if (array == null) {
            array = new LinkedList();
            arrays[parentNodeId] = array;
        }
        array.add(destination);
    }

    public void printGraph() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arrays.length;i++){
            sb.append(i+"-->"+arrays[i]);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public int getVerticesCount() {
        return verticesCount;
    }    

    public LinkedList[] getArrays() {
        return arrays;
    }
    
}
