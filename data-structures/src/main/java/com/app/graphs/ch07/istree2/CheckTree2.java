/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch07.istree2;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dprokopiuk
 */
public class CheckTree2 {
    
    public boolean isTree(Graph g) {
        if(!hasOneParent(g)){
            return false;
        }        
        return true;
    }
    
    private boolean hasOneParent(Graph g){
        int n = g.getVerticesCount();
        boolean[] hasOneParent = new boolean[n];        
        for(int i=0;i<n;i++){
            List<Integer> list = g.getArray()[i];
            if(list!=null){
                
                for(int j=0;j<list.size();j++){                    
                    int val = list.get(j);
                    if(hasOneParent[val]){
                        return false;
                    }                
                    hasOneParent[val] = true;
                }
                
            }
        }
        
        System.out.println(Arrays.toString(hasOneParent));
        
        int hasNoParent = 0;
        for (int i = 0; i < n; i++) {
            if(!hasOneParent[i]){
                hasNoParent++;
            }
        }
        return hasNoParent==1;
    }
    
}
