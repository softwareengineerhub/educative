package com.app03.concurr.ch03;

public class MyTLThread extends Thread {

    private ThreadLocal<Integer> threadLocal;

    public MyTLThread(ThreadLocal<Integer> threadLocal) {
        this.threadLocal = threadLocal;
    }

    public void run(){
        while(true){
            int res = threadLocal.get();
            threadLocal.set(res+1);
            System.out.println("Plus thread: "+threadLocal.get());
        }
    }
}
