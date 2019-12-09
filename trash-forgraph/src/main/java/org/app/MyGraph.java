/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app;

import java.util.LinkedList;

/**
 *
 * @author DProkopiuk
 */
public class MyGraph {
    
    private int verticesCount;
    private LinkedList<Coordinate>[] array;

    public MyGraph(int verticesCount) {
        this.verticesCount = verticesCount;
        array = new LinkedList[verticesCount];
    }
    
    public void insert(int source, Coordinate coordinate){
        if(array[source]==null){
           array[source] = new LinkedList();
        }
        array[source].add(coordinate);
    }
    
    public void printMyGraph(){
        for(int i=0;i<array.length;i++){
            System.out.println(i+" --> "+array[i]);
        }
    }
    
    public LinkedList<Coordinate> getItems(int source){
        return array[source];
    }
    
}
