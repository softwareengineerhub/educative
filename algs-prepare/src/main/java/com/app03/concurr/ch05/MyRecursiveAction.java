package com.app03.concurr.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    private int nodesCount;
    private String name;

    public MyRecursiveAction(int nodesCount, String name) {
        this.nodesCount = nodesCount;
        this.name=name;
    }

    @Override
    protected void compute() {
        System.out.println(name+" START "+nodesCount+"; "+Thread.currentThread().getName());
        if(nodesCount>2){
            List<MyRecursiveAction> list = createActions();
            for(MyRecursiveAction item: list){
                item.fork();
            }

            for(MyRecursiveAction item: list){
                item.join();
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" FINISH "+nodesCount+"; "+Thread.currentThread().getName());
    }

    private List<MyRecursiveAction> createActions(){
        List<MyRecursiveAction> list = new ArrayList<>();
        list.add(new MyRecursiveAction(nodesCount/2, "\t"+name+"->A"));
        list.add(new MyRecursiveAction(nodesCount-nodesCount/2, "\t"+name+"->B"));
        return list;
    }
}
