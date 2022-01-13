package com.app03.concurr.ch06;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        long res = forkJoinPool.submit(new Callable<Long>() {

            @Override
            public Long call() throws Exception {
                return list.parallelStream().peek(i-> System.out.println(i)).mapToInt(i->i).count();
            }

        }).get();
        System.out.println("res="+res);
    }

}
