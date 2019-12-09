/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash.path;

import com.mycompany.trash.forgraph.Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author Dprokopiuk
 */
public class AllPaths {
    
    private Map<Integer, List<Integer>> map = new TreeMap();
        
    public void findPath(Graph g, int source, int target){
        
        int n = g.getVericesCount();
        boolean[] visited = new boolean[n];        
        
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        
        List<Integer> path = new LinkedList();
        
        while(!stack.isEmpty()){
            int val = stack.pop();
            visited[val] = true;
            path.add(val);            
                        
            List<Integer> list = g.getArray()[val];
            if(list==null){
                continue;
            }
                        
            for(int i=0;i<list.size();i++){
                int value = list.get(i);                
                if(value==target){                    
                    List<Integer> listData = new ArrayList<>();
                    listData.addAll(path);
                    listData.add(value);
                    System.out.println(listData);
                    visited[value] = false;
//                    visited[val] = false;
                  //  stack.pop();
                    //path.remove(path.size()-1);
                    //map.put(listData.size(), path);
                    //return;
                }                                                
                stack.add(value);
            }            
        }
        
        System.out.println("-----------------------------");
        for(int key: map.keySet()){
            System.out.println(key+" --> " + map.get(key));
        }
        System.out.println("-----------------------------");
    }
    
}
