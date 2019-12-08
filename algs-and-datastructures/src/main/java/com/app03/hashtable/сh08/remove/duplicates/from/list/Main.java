/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh08.remove.duplicates.from.list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list);
        removeDuplicatesWithHashing(list);
        System.out.println(list);
    }

    public static void removeDuplicatesWithHashing(List list) {
        Set set  = new HashSet();
        set.addAll(list);
        list.clear();
        list.addAll(set);
    }

}
