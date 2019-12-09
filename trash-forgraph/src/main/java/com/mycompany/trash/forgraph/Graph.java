/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.forgraph;

import java.util.LinkedList;

/**
 *
 * @author Dprokopiuk
 */
public class Graph {

    private LinkedList[] array;
    private int vericesCount;

    public Graph(int vericesCount) {
        this.vericesCount = vericesCount;
        array = new LinkedList[vericesCount];
    }
    
    public void addEdge(int source, int value){
        if(array[source]==null){
            array[source] = new LinkedList();
        }
        LinkedList list = array[source];
        list.add(value);
    }
    
    public void printGraph(){
        System.out.println("---------------------");
        for(int i=0;i<array.length;i++){
            System.out.println(i+": --> "+array[i]);
        }
        System.out.println("---------------------");
    }

    public LinkedList[] getArray() {
        return array;
    }

    public int getVericesCount() {
        return vericesCount;
    }
    
    

}
