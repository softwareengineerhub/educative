/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.number.of.edges;

import com.mycompany.trash.forgraph.Graph;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author Dprokopiuk
 */
public class FindEdgesCount {

    public int findCount(Graph g){
        
        LinkedList[] data = g.getArray();        
        Set<String> pairs = new HashSet();
        
        for(int i=0;i<data.length;i++){            
            LinkedList<Integer> tmp = data[i];
            if(tmp==null){
                continue;
            }
            
            for(int j=0;j<tmp.size();j++){                
                String a = i+";"+j;
                String b = j+";"+i;
                pairs.add(a);
                pairs.add(b);                
            }            
        }        
        return pairs.size()/2;
    }
    
}
