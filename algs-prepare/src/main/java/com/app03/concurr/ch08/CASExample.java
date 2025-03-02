package com.app03.concurr.ch08;

import java.util.concurrent.atomic.AtomicInteger;

public class CASExample {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        int a = 0;
        int b = a + 1;
        while (!counter.compareAndSet(a, b)) {
            //retry if the compare-and-swap fails
            a = counter.get();
            b = a + 1;
        }
        System.out.println("Updated value: " + counter.get());
    }

}
