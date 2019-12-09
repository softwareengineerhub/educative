/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app3;

import com.mycompany.trash.forgraph.Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class AllPathes {

    public List<Stack<Integer>> findAllPathes(Graph g) {
        List<Stack<Integer>> result = new ArrayList();                        
        Stack<Integer> storage = new Stack();
        DFS(g, 0, storage, result);
        return result;
    }
    
    private void DFS(Graph g, int source, Stack<Integer> storage, List<Stack<Integer>> result){        
        storage.push(source);      
        LinkedList<Integer> list = g.getArray()[source];
        if (list != null) {            
            for (int i = 0; i < list.size(); i++) {              
                DFS(g, list.get(i), storage, result);        
                storage.pop();
            }           
        } else {
            Stack<Integer> tmp = new Stack();
            for(int item : storage){
                tmp.push(item);
            }
            result.add(tmp);
        }
      //  storage.pop();
        
                
        
    }
    

}
