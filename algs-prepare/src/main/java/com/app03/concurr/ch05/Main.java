package com.app03.concurr.ch05;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new MyRecursiveAction(10, "Root"));
    }

}
