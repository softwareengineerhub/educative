/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch06.path.between.vertices;

import com.app.graphs.ch01.adjacency.list.Graph;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DProkopiuk
 */
public class CheckPaths {

    public static Object checkPath(Graph g, int source, int destination) {
        int n = g.getVerticesCount();
        
        boolean[] visited = new boolean[n];
        visited[source] = true;
        
        Stack stack = new Stack();
        stack.push(source);        
        
        LinkedList path = new LinkedList();        
                
        while(!stack.isEmpty()){
            int node = (int) stack.pop();
                        
            LinkedList data = g.getArray()[node];
            if (data != null) {
                for (int i = 0; i < data.size(); i++) {
                    int tmp = (int)data.get(i);
                    
                    if(!visited[tmp]){
                        if(tmp==destination){                            
                            /*System.out.println(Arrays.toString(visited));
                            StringBuilder sb = new StringBuilder();
                            for (int k = 0; k < visited.length; k++) {
                                if (visited[k]) {
                                    sb.append(k);
                                    sb.append(";");
                                }
                            }
                            System.out.println(sb);*/
                            return true;
                        }
                        stack.push(tmp);
                        visited[tmp] = true;
                        
                    }
                }
            }
        }
        
        return false;
    }

}
