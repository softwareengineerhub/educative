package org.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue queue = new LinkedList();
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        queue.addAll(list);
        Object res = queue.remove();
        System.out.println("res="+res);
        res = queue.remove();
        System.out.println("res="+res);


    }

}
