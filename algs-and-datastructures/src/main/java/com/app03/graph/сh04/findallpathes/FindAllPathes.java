/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.graph.сh04.findallpathes;

import com.app03.graph.сh00.graph.MyGraph;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class FindAllPathes {

    public List<Stack<Integer>> findAllPathes(MyGraph g) {
        List<Stack<Integer>> result = new ArrayList<>();
        Stack<Integer> storage = new Stack<>();
        DFS(g, 0, storage, result);
        return result;
    }

    private void DFS(MyGraph g, int source, Stack<Integer> storage, List<Stack<Integer>> result) {
        
        storage.push(source);
        
        List<Integer> list = g.getArray()[source];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                DFS(g, list.get(i), storage, result);
            }
            storage.pop();
        } else {
            Stack<Integer> tmp = new Stack();
            tmp.addAll(storage);
            result.add(tmp);
        }

    }
}
