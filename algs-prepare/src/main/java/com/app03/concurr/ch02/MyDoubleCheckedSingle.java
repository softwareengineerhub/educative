package com.app03.concurr.ch02;

public class MyDoubleCheckedSingle {
    private static volatile MyDoubleCheckedSingle instance;

    private MyDoubleCheckedSingle() {
    }

    public static MyDoubleCheckedSingle getInstance() {
        if (instance == null) {
            synchronized (MyDoubleCheckedSingle.class) {
                if (instance == null) {
                    instance = new MyDoubleCheckedSingle();
                }
            }
        }
        return instance;
    }
}
