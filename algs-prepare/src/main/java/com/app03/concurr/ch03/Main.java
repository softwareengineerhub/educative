package com.app03.concurr.ch03;

public class Main {

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
        Thread t = new MyTLThread(threadLocal);
        Thread t2 = new MyTLThread2(threadLocal);

        t.start();
        t2.start();
    }

}
