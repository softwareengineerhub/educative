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
public class Main {

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] data = new int[n][];
        MyGraph myGraph = new MyGraph(n * m);
        Coordinate coordinate = new Coordinate();                
        coordinate.setI(0);
        coordinate.setJ(0);
        coordinate.setValue(data[0][0]);        
        myGraph.insert(0, coordinate);
        
        
        LinkedList<Coordinate> children = new LinkedList();
        children.add(coordinate);
        int index = 0;
        while(!children.isEmpty()){
            index++;
            Coordinate c = children.removeFirst();
            int i = c.getI();
            int j = c.getJ();
            Coordinate a = new Coordinate(i+1, j, c.getValue());
            Coordinate b = new Coordinate(i, j+1, c.getValue());
            if((i+1)<n){
                myGraph.insert(index, a);
            }
            if((j+1)<m){
                myGraph.insert(index, b);
            }            
        }
        
        /*coordinate = new Coordinate();                
        coordinate.setI(1);
        coordinate.setJ(0);
        coordinate.setValue(data[1][0]);        
        myGraph.insert(1, coordinate);
        
        coordinate = new Coordinate();                
        coordinate.setI(1);
        coordinate.setJ(1);
        coordinate.setValue(data[0][1]);        
        myGraph.insert(1, coordinate);                
        myGraph.getItems(0);*/
        
        
        
        
                        
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Coordinate coordinate = new Coordinate();                
                myGraph.insert(i, coordinate);
            }
        }*/
    }
}
