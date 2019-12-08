/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh00.graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asusadmin
 */
public class MyGraph {

    private List[] array;

    public MyGraph(int verticesCount) {
        array = new List[verticesCount];
    }

    public void addEdge(int source, int childValue) {
        if (array[source] == null) {
            array[source] = new ArrayList();
        }
        array[source].add(childValue);
    }

    public List[] getArray() {
        return array;
    }

    public int getVerticiesCount() {
        return array.length;
    }
    
    public void printGraph(){
        System.out.println("-----------MyGraph-----------");
        for(int i=0;i<array.length;i++){
            System.out.println(i+" : "+ array[i]);
        }
        System.out.println("-----------------------------");
    }

}
