package com.app03.concurr.ch03;

public class MyTLThread2 extends Thread {

    private ThreadLocal<Integer> threadLocal;

    public MyTLThread2(ThreadLocal<Integer> threadLocal) {
        this.threadLocal = threadLocal;
    }

    public void run(){
        while(true){
            int res = threadLocal.get();
            threadLocal.set(res-1);
            System.out.println("Minus thread: "+threadLocal.get());
        }
    }
}
