package com.app03.concurr.ch01;

public class MyData {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "value=" + value +
                '}';
    }
}
